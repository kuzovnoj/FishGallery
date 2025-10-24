package com.bluerose.fishgallery.ui.theme

import androidx.compose.foundation.shape.CornerBasedShape
import androidx.compose.foundation.shape.RoundedCornerShape
//import androidx.compose.material.Shapes
import androidx.compose.material3.Shapes
import androidx.compose.ui.unit.dp

val Shapes = Shapes(
    small = RoundedCornerShape(8.dp),
    medium = RoundedCornerShape(32.dp),
    large = RoundedCornerShape(0.dp)
)

data class JetShape(
    val small: CornerBasedShape,
    val medium: CornerBasedShape,
    val large: CornerBasedShape,
    val dialog: CornerBasedShape
)

val jetShape = JetShape(
    small = RoundedCornerShape(8.dp),
    medium = RoundedCornerShape(16.dp),
    large = RoundedCornerShape(64.dp),
    dialog = RoundedCornerShape(24.dp)
)