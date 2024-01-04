package com.example.homework18_2.data

import android.util.Log.d
import com.example.homework18_2.data.common.Resource
import com.example.homework18_2.domain.UserItem
import com.example.homework18_2.domain.UserRepository
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import javax.inject.Inject

class UserRepositoryImpl @Inject constructor(private val userService: UserService): UserRepository{
    override fun getUsers(): Flow<Resource<List<UserItem>>> {
        return flow {
            try {
                emit(Resource.Loading(loading = true))
                val response = userService.getUsers()
                if (response.isSuccessful){
                    emit(Resource.Success(data = response.body()!!.map {
                        it.toDomain()
                    }))
                }else{
                    emit(Resource.Error(errorMessage = response.errorBody().toString()))
                }
            }catch (t: Throwable){
                d("responseError", "${t.message}")
            }
            emit(Resource.Loading(loading = false))
        }
    }
}