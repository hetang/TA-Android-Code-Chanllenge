package com.example.mytripactions.repository

import com.example.mytripactions.api.NewsApi
import com.example.mytripactions.api.NewsResponse
import io.reactivex.rxjava3.core.Observable

class NewsRepositoryImpl(private val newsApi: NewsApi) : NewsRepository {

    override suspend fun getNews(): NewsResponse {
        return NewsResponse(emptyList())
    }

    override fun getNewsObservable(): Observable<NewsResponse> {
        return Observable.create { }
    }

    override fun getNewsCall(): Observable<NewsResponse> {
        return Observable.create { }
    }
}