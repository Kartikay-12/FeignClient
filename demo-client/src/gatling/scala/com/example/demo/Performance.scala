package com.example.demo

import io.gatling.core.Predef._
import io.gatling.http.Predef._
import scala.concurrent.duration._

class Performance extends Simulation {

 
  val httpConf = http.baseUrl("http://localhost:8082") 
    .header("Accept", "application/json")
    .header("Content-Type", "application/json")

  
  val retrieveByRestControllerScenario = scenario("Retrieve by Rest Controller")
    .exec(http("Get Employee by Rest Controller")
      .get("/api/restController/retrieve/1")
      .check(status.is(200))
    )

 

  // Set up the load test
  setUp(
    retrieveByRestControllerScenario.inject(
      atOnceUsers(5), 
      rampUsers(10) during (10.seconds) 
    ).protocols(httpConf))
}
