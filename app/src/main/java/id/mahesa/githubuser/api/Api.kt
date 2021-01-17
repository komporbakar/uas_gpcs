package id.mahesa.githubuser.api

import id.mahesa.githubuser.data.model.DetailUserResponse
import id.mahesa.githubuser.data.model.User
import id.mahesa.githubuser.data.model.UserResponse
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Headers
import retrofit2.http.Path
import retrofit2.http.Query

interface Api {
    @GET("search/users")
    @Headers("Authorization: token c31f07d5d7b08eec776c8dcc714ae2217d7e157f")
    fun getSearchUsers(
        @Query("q") query: String
    ): Call<UserResponse>

    @GET("users/{username}")
    @Headers("Authorization: token c31f07d5d7b08eec776c8dcc714ae2217d7e157f")
    fun getUserDetail(
        @Path("username") username : String
    ): Call<DetailUserResponse>

    @GET("users/{username}/followers")
    @Headers("Authorization: token c31f07d5d7b08eec776c8dcc714ae2217d7e157f")
    fun getFollowers(
        @Path("username") username: String
    ): Call<ArrayList<User>>

    @GET("users/{username}/following")
    @Headers("Authorization: token c31f07d5d7b08eec776c8dcc714ae2217d7e157f")
    fun getFollowing(
        @Path("username") username: String
    ): Call<ArrayList<User>>
}