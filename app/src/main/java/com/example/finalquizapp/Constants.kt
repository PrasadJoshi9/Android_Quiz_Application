package com.example.finalquizapp

object Constants {

    const val USER_NAME:String = "user_name"
    const val TOTAL_QUESTIONS: String = "total_question"
    const val CORRECT_ANSWERS:String = "correct_answers"

    fun getQuestions(): ArrayList<Question>{
        val questionsList = ArrayList<Question>()

        val que1 = Question(1,"What Country does this flag belongs to? ",
        R.drawable.ic_flag_of_argentina,"USA","UK","UAE","Argentina",4
        )
        questionsList.add(que1)

        val que2 = Question(2,"What Country does this flag belongs to? ",
                R.drawable.ic_flag_of_australia,"USA","UK","UAE","Australia",4
        )
        questionsList.add(que2)

        val que3 = Question(3,"What Country does this flag belongs to? ",
                R.drawable.ic_flag_of_belgium,"USA","UK","UAE","Belgium",4
        )
        questionsList.add(que3)

        val que4 = Question(4,"What Country does this flag belongs to? ",
                R.drawable.ic_flag_of_brazil,"USA","UK","UAE","Brazil",4
        )
        questionsList.add(que4)

        val que5 = Question(5,"What Country does this flag belongs to? ",
                R.drawable.ic_flag_of_denmark,"USA","UK","UAE","Denmark",4
        )
        questionsList.add(que5)

        val que6 = Question(6,"What Country does this flag belongs to? ",
                R.drawable.ic_flag_of_fiji,"USA","UK","UAE","Fiji",4
        )
        questionsList.add(que6)

        val que7 = Question(7,"What Country does this flag belongs to? ",
                R.drawable.ic_flag_of_germany,"USA","UK","UAE","Germany",4
        )
        questionsList.add(que7)

        val que8 = Question(8,"What Country does this flag belongs to? ",
                R.drawable.ic_flag_of_india,"USA","UK","UAE","India",4
        )
        questionsList.add(que8)

        val que9 = Question(9,"What Country does this flag belongs to? ",
                R.drawable.ic_flag_of_kuwait,"USA","UK","UAE","Kuwait",4
        )
        questionsList.add(que9)

        val que10 = Question(10,"What Country does this flag belongs to? ",
                R.drawable.ic_flag_of_new_zealand,"USA","UK","UAE","NewZ",4
        )
        questionsList.add(que10)

        return questionsList
    }
}