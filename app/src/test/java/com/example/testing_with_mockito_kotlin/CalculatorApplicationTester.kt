package com.example.testing_with_mockito_kotlin

import org.junit.Assert
import org.junit.Test
import org.junit.runner.RunWith
import org.mockito.InjectMocks
import org.mockito.Mock
import org.mockito.Mockito.`when`
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner::class)
class CalculatorApplicationTester {

    @InjectMocks
    var calculatorApplication: CalculatorApplication = CalculatorApplication()

    @Mock
    var calcService: CalculatorService? = null

    @Test
    fun testAdd() {
        `when`(calcService!!.add(10.0, 20.0)).thenReturn(30.00)
        Assert.assertEquals(calculatorApplication.add(10.0, 20.0), 30.0, 0)
    }
}