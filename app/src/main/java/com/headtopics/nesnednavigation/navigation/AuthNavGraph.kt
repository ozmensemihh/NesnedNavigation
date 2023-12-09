package com.headtopics.nesnednavigation.navigation

import androidx.navigation.NavController
import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable
import androidx.navigation.navigation
import com.headtopics.nesnednavigation.AUTH_GRAPH_ROUTE
import com.headtopics.nesnednavigation.LoginScreen
import com.headtopics.nesnednavigation.Screen
import com.headtopics.nesnednavigation.SignUpScreen


fun NavGraphBuilder.authNavGraph(navController: NavController){
    navigation(
        startDestination = Screen.Login.route,
        route = AUTH_GRAPH_ROUTE){

        composable(route = Screen.Login.route){
            LoginScreen(navController = navController)
        }
        composable(route = Screen.SingUp.route){
            SignUpScreen(navController = navController)
        }
    }
}