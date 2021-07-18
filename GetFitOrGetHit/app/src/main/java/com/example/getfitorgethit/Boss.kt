package com.example.getfitorgethit

object Boss {

    private var bosscurrenthealth=1350
    private var bossmaxhealth=1350
    fun getbosshealth():Int{
        return bosscurrenthealth
    }
    fun setcurrbosshealth(health:Int){
        bosscurrenthealth=health

    }
    fun setnewmaxhealth(health:Int){
        bossmaxhealth=health
    }
    fun getmaxhealth():Int{
        return bossmaxhealth
    }
}