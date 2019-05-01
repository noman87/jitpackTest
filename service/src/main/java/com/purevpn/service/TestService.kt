package com.purevpn.service

import com.purevpn.core.CoreTest
import com.purevpn.core.CoreTestModel

class TestService {


    fun test():CoreTestModel{
        return  CoreTest().getString()
    }
}