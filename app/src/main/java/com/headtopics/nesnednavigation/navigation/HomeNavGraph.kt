package com.headtopics.nesnednavigation.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavController
import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable
import androidx.navigation.navigation
import com.headtopics.nesnednavigation.DetailScreen
import com.headtopics.nesnednavigation.HOME_GRAPH_ROUTE
import com.headtopics.nesnednavigation.HomeScreen
import com.headtopics.nesnednavigation.Screen


fun NavGraphBuilder.homeNavGraph(navController: NavController){
    navigation(
        startDestination = Screen.Home.route,
        route = HOME_GRAPH_ROUTE
    ){
        composable(route = Screen.Home.route){
            HomeScreen(navController = navController)
        }
        composable(route = Screen.Detail.route){
            DetailScreen(navController = navController)
        }
    }
}