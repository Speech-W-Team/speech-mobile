package wtf.speech.compose.kit.materialComponents

import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.material3.AssistChipDefaults
import androidx.compose.material3.ChipBorder
import androidx.compose.material3.ChipColors
import androidx.compose.material3.ChipElevation
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.FilterChipDefaults
import androidx.compose.material3.InputChipDefaults
import androidx.compose.material3.SelectableChipBorder
import androidx.compose.material3.SelectableChipColors
import androidx.compose.material3.SelectableChipElevation
import androidx.compose.material3.SuggestionChipDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Shape

@ExperimentalMaterial3Api
@Composable
fun AssistChip(
    onClick: () -> Unit,
    label: @Composable () -> Unit,
    modifier: Modifier = Modifier,
    enabled: Boolean = true,
    leadingIcon: (@Composable () -> Unit)? = null,
    trailingIcon: (@Composable () -> Unit)? = null,
    shape: Shape = AssistChipDefaults.shape,
    colors: ChipColors = AssistChipDefaults.assistChipColors(),
    elevation: ChipElevation? = AssistChipDefaults.assistChipElevation(),
    border: ChipBorder? = AssistChipDefaults.assistChipBorder(),
    interactionSource: MutableInteractionSource = remember { MutableInteractionSource() }
) {
    AssistChip(
        onClick,
        label,
        modifier,
        enabled,
        leadingIcon,
        trailingIcon,
        shape,
        colors,
        elevation,
        border,
        interactionSource
    )
}

@ExperimentalMaterial3Api
@Composable
fun ElevatedAssistChip(
    onClick: () -> Unit,
    label: @Composable () -> Unit,
    modifier: Modifier = Modifier,
    enabled: Boolean = true,
    leadingIcon: (@Composable () -> Unit)? = null,
    trailingIcon: (@Composable () -> Unit)? = null,
    shape: Shape = AssistChipDefaults.shape,
    colors: ChipColors = AssistChipDefaults.elevatedAssistChipColors(),
    elevation: ChipElevation? = AssistChipDefaults.elevatedAssistChipElevation(),
    border: ChipBorder? = null,
    interactionSource: MutableInteractionSource = remember { MutableInteractionSource() }
) {
    ElevatedAssistChip(
        onClick,
        label,
        modifier,
        enabled,
        leadingIcon,
        trailingIcon,
        shape,
        colors,
        elevation,
        border,
        interactionSource
    )
}

@ExperimentalMaterial3Api
@Composable
fun FilterChip(
    selected: Boolean,
    onClick: () -> Unit,
    label: @Composable () -> Unit,
    modifier: Modifier = Modifier,
    enabled: Boolean = true,
    leadingIcon: (@Composable () -> Unit)? = null,
    trailingIcon: (@Composable () -> Unit)? = null,
    shape: Shape = FilterChipDefaults.shape,
    colors: SelectableChipColors = FilterChipDefaults.filterChipColors(),
    elevation: SelectableChipElevation? = FilterChipDefaults.filterChipElevation(),
    border: SelectableChipBorder? = FilterChipDefaults.filterChipBorder(),
    interactionSource: MutableInteractionSource = remember { MutableInteractionSource() }
) {
    FilterChip(
        selected,
        onClick,
        label,
        modifier,
        enabled,
        leadingIcon,
        trailingIcon,
        shape,
        colors,
        elevation,
        border,
        interactionSource
    )
}

@ExperimentalMaterial3Api
@Composable
fun ElevatedFilterChip(
    selected: Boolean,
    onClick: () -> Unit,
    label: @Composable () -> Unit,
    modifier: Modifier = Modifier,
    enabled: Boolean = true,
    leadingIcon: (@Composable () -> Unit)? = null,
    trailingIcon: (@Composable () -> Unit)? = null,
    shape: Shape = FilterChipDefaults.shape,
    colors: SelectableChipColors = FilterChipDefaults.elevatedFilterChipColors(),
    elevation: SelectableChipElevation? = FilterChipDefaults.elevatedFilterChipElevation(),
    border: SelectableChipBorder? = null,
    interactionSource: MutableInteractionSource = remember { MutableInteractionSource() }
) {
    androidx.compose.material3.ElevatedFilterChip(
        selected,
        onClick,
        label,
        modifier,
        enabled,
        leadingIcon,
        trailingIcon,
        shape,
        colors,
        elevation,
        border,
        interactionSource
    )
}

@ExperimentalMaterial3Api
@Composable
fun InputChip(
    selected: Boolean,
    onClick: () -> Unit,
    label: @Composable () -> Unit,
    modifier: Modifier = Modifier,
    enabled: Boolean = true,
    leadingIcon: (@Composable () -> Unit)? = null,
    avatar: (@Composable () -> Unit)? = null,
    trailingIcon: (@Composable () -> Unit)? = null,
    shape: Shape = InputChipDefaults.shape,
    colors: SelectableChipColors = InputChipDefaults.inputChipColors(),
    elevation: SelectableChipElevation? = InputChipDefaults.inputChipElevation(),
    border: SelectableChipBorder? = InputChipDefaults.inputChipBorder(),
    interactionSource: MutableInteractionSource = remember { MutableInteractionSource() }
) {
    InputChip(
        selected,
        onClick,
        label,
        modifier,
        enabled,
        leadingIcon,
        avatar,
        trailingIcon,
        shape,
        colors,
        elevation,
        border,
        interactionSource
    )
}

@ExperimentalMaterial3Api
@Composable
fun SuggestionChip(
    onClick: () -> Unit,
    label: @Composable () -> Unit,
    modifier: Modifier = Modifier,
    enabled: Boolean = true,
    icon: (@Composable () -> Unit)? = null,
    shape: Shape = SuggestionChipDefaults.shape,
    colors: ChipColors = SuggestionChipDefaults.suggestionChipColors(),
    elevation: ChipElevation? = SuggestionChipDefaults.suggestionChipElevation(),
    border: ChipBorder? = SuggestionChipDefaults.suggestionChipBorder(),
    interactionSource: MutableInteractionSource = remember { MutableInteractionSource() }
) {
    androidx.compose.material3.SuggestionChip(
        onClick,
        label,
        modifier,
        enabled,
        icon,
        shape,
        colors,
        elevation,
        border,
        interactionSource
    )
}

@ExperimentalMaterial3Api
@Composable
fun ElevatedSuggestionChip(
    onClick: () -> Unit,
    label: @Composable () -> Unit,
    modifier: Modifier = Modifier,
    enabled: Boolean = true,
    icon: (@Composable () -> Unit)? = null,
    shape: Shape = SuggestionChipDefaults.shape,
    colors: ChipColors = SuggestionChipDefaults.elevatedSuggestionChipColors(),
    elevation: ChipElevation? = SuggestionChipDefaults.elevatedSuggestionChipElevation(),
    border: ChipBorder? = null,
    interactionSource: MutableInteractionSource = remember { MutableInteractionSource() }
) {
    androidx.compose.material3.ElevatedSuggestionChip(
        onClick,
        label,
        modifier,
        enabled,
        icon,
        shape,
        colors,
        elevation,
        border,
        interactionSource
    )
}
