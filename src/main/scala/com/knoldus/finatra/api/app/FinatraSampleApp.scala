package com.knoldus.finatra.api.app

import com.jakehschwartz.finatra.swagger.DocsController
import com.knoldus.finatra.api.controller.SampleController
import com.knoldus.finatra.api.swagger.SampleSwaggerModule
import com.twitter.finatra.http.HttpServer
import com.twitter.finatra.http.routing.HttpRouter


object SampleApp extends HttpServer {

  override def configureHttp(router: HttpRouter) {
    router
      .add[DocsController]
      .add[SampleController]
  }

  override protected def modules = Seq(SampleSwaggerModule)
}
