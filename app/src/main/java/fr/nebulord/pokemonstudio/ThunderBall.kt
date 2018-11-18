package fr.nebulord.pokemonstudio

data class ThunderBall(val maxX: Float, val maxY: Float) {
    var cx: Float = 80F
    var cy: Float = 80F
    val rad: Float= 80F
    var delta = 10
    var dx = delta
    var dy = delta

    fun move() {
        when {
            cx < 0F -> dx = delta
            cx > maxX -> dx = -delta
            cy < 0F -> dy = delta
            cy > maxY -> dy = -delta
        }
        cx += dx
        cy += dy
    }
}