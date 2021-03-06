package com.example.curriculumvitae.classes

import java.time.LocalDate
import java.util.*

data class Person(var id: Int,
                  var fName: String,
                  var lName: String,
                  var mName: String,
                  var bDate: Date?,
                  var phone: String,
                  var email: String,
                  var facebook: String,
                  var twitter: String,
                  var note: String)

