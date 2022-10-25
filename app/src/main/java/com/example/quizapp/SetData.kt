package com.example.quizapp

object SetData {
    fun getQuestion():ArrayList<QuestionData>{
        var que:ArrayList<QuestionData> = arrayListOf()

        var q1= QuestionData(
            1,
        "What is the capital of Bangladesh?",
            "Magura",
            "Dacca",
            "Khulna",
            "Dhaka",
            4

        )

        var q2= QuestionData(
            2,
            "What is the Previous Name Of Dhaka?",
            "Magura",
            "Dacca",
            "Khulna",
            "Dhaka",
            2

        )

        var q3= QuestionData(
            3,
            "What is the Previous Name Of Jessore",
            "Nodia",
            "Vola",
            "Kolkata",
            "Asham",
            1

        )

        var q4= QuestionData(
            4,
            "What is the meaning of cyclone Chitrang",
            "Stone",
            "Leaf",
            "Tree",
            "Root",
            2

        )

        var q5= QuestionData(
            5,
            "Which counter set the name chitrang",
            "vietnam",
            "China",
            "India",
            "Dhaka",
            1

        )
        que.add(q1);
        que.add(q2);
        que.add(q3);
        que.add(q4);
        que.add(q5);
        return que;
    }
}