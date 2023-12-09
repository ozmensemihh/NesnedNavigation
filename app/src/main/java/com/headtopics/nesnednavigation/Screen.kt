package com.headtopics.nesnednavigation


const val ROOT_GRAPH_ROUTE = "root"
const val AUTH_GRAPH_ROUTE = "auth"
const val HOME_GRAPH_ROUTE = "home"


sealed class Screen (val route:String){
    object Home :Screen(route = "home_screen")
    object Detail:Screen(route = "detail_screen")
    object Login : Screen("login_screen")
    object SingUp:Screen("singup_screen")
}