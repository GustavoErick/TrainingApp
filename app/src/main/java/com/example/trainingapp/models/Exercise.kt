package com.example.trainingapp.models

import com.example.trainingapp.R

data class Exercise (
    val id: Int,
    val name: String,
    val description: String,
    val muscleGrouping: String,
    val imageRes : Int,
    var isFavorite: Boolean = false
)

val exerciseList = listOf(
    Exercise(1, "Push-up", "Um exercício clássico para peito e tríceps.", "Peito e Tríceps", R.drawable.push_up),
    Exercise(2, "Squat", "Agachamento que trabalha pernas e glúteos.", "Pernas e Glúteos", R.drawable.squat),
    Exercise(3, "Pull-up", "Exercício para costas e bíceps.", "Costas e Bíceps", R.drawable.pull_up),
    Exercise(4, "Plank", "Exercício isométrico para fortalecimento do core.", "Core", R.drawable.plank),
    Exercise(5, "Deadlift", "Levantamento terra para posterior de coxa e lombar.", "Posterior de Coxa e Lombar", R.drawable.deadlift),
    Exercise(6, "Bench Press", "Exercício de supino para peito e tríceps.", "Peito e Tríceps", R.drawable.bench_press),
    Exercise(7, "Shoulder Press", "Press militar para deltoides e tríceps.", "Ombros e Tríceps", R.drawable.shoulder_press),
    Exercise(8, "Bicep Curl", "Flexão de braço para fortalecimento dos bíceps.", "Bíceps", R.drawable.bicep_curl),
    Exercise(9, "Lunge", "Afundo para pernas e glúteos.", "Pernas e Glúteos", R.drawable.lunge),
    Exercise(10, "Tricep Dip", "Paralelas para tríceps e peito.", "Tríceps e Peito", R.drawable.tricep_dip),
    Exercise(11, "Crunch", "Abdominal para fortalecimento do reto abdominal.", "Core", R.drawable.crunch),
    Exercise(12, "Leg Press", "Prensa de perna para quadríceps e glúteos.", "Pernas e Glúteos", R.drawable.leg_press),
    Exercise(13, "Lat Pulldown", "Pulldown para costas e bíceps.", "Costas e Bíceps", R.drawable.lat_pulldown),
    Exercise(14, "Cable Fly", "Cross-over para peito.", "Peito", R.drawable.cable_fly),
    Exercise(15, "Leg Curl", "Mesa flexora para posterior de coxa.", "Posterior de Coxa", R.drawable.leg_curl),
)