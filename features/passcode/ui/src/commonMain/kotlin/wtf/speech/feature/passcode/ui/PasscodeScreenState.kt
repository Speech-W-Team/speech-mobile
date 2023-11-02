package wtf.speech.feature.passcode.ui

import androidx.compose.runtime.mutableStateListOf
import androidx.compose.runtime.snapshots.SnapshotStateList
import wtf.speech.core.domain.models.DecryptedData
import wtf.speech.core.ui.ContentState
import wtf.speech.core.ui.ErrorState
import wtf.speech.core.ui.ScreenAction
import wtf.speech.core.ui.ScreenEffect
import wtf.speech.core.ui.ScreenEvent
import wtf.speech.core.ui.ScreenState

const val MAX_PASSCODE_SIZE = 6

internal data class PasscodeScreenState(
    val enteredPasscode: SnapshotStateList<Int> = mutableStateListOf(),
    val position: Int = enteredPasscode.size - 1,
    val contentState: ContentState<Unit>? = null,
    val isBiometricAuthEnabled: Boolean = false,
    val maxPasscodeSize: Int = MAX_PASSCODE_SIZE,
) : ScreenState

internal sealed class PasscodeScreenEvent : ScreenEvent {
    data class EnterNumber(val number: Int) : PasscodeScreenEvent()
    data object NonEqualsPasscodes : PasscodeScreenEvent()
    data object StartBiometricAuthentication : PasscodeScreenEvent()
    data object ClearPasscode : PasscodeScreenEvent()
    data object DeleteLastPasscode : PasscodeScreenEvent()

}

internal sealed class PasscodeScreenAction : ScreenAction {
    data class EnterNumber(val number: Int) : PasscodeScreenAction()
    data object Clear : PasscodeScreenAction()
    data object Backspace : PasscodeScreenAction()
    data object EnableBiometricAuth : PasscodeScreenAction()
}

internal sealed class PasscodeScreenEffect : ScreenEffect {
    data class EnterPasscodeSuccess(val encryptionKey: DecryptedData) : PasscodeScreenEffect() {
        override fun equals(other: Any?): Boolean {
            if (this === other) return true
            if (other !is EnterPasscodeSuccess) return false

            if (encryptionKey != other.encryptionKey) return false

            return true
        }

        override fun hashCode(): Int {
            return encryptionKey.hashCode()
        }
    }

    data object WrongPasscode : PasscodeScreenEffect()
    data object StartBiometricAuth : PasscodeScreenEffect()
    data object Logout : PasscodeScreenEffect()
}

sealed class PasscodeScreenError(error: Throwable) : ErrorState(error) {
    data object InvalidPasscode : PasscodeScreenError(Throwable("Passcode error"))
    data object BiometricAuthError : PasscodeScreenError(Throwable("Biometric auth error"))

    data object TokenError : PasscodeScreenError(Throwable("Token error"))
}
