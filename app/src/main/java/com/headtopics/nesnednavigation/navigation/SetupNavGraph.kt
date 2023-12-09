package com.headtopics.nesnednavigation.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import com.headtopics.nesnednavigation.HOME_GRAPH_ROUTE
import com.headtopics.nesnednavigation.ROOT_GRAPH_ROUTE

@Composable
fun SetupNavGraph(
    navController:NavHostController
){

   NavHost(navController = navController,
       startDestination = HOME_GRAPH_ROUTE,
       route = ROOT_GRAPH_ROUTE
   ){

       authNavGraph(navController)
       homeNavGraph(navController)


   }


}