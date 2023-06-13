package inc.fabudi.lists

data class User(
    val firstName: String,
    val lastName: String,
    val age: Int,
    val sex: Sex,
    val squareAvatarUrl: String,
    val description: String
)

enum class Sex {
    UNKNOWN,
    MALE,
    FEMALE
}
