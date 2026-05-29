package de.seuhd.worldcup

data class Standing(
    val teamName: String,
    var points: Int = 0,
    var goalsFor: Int = 0,
    var goalsAgainst: Int = 0
) {

    val goalDifference: Int
        get() = goalsFor - goalsAgainst
}