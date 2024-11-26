import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.widthIn
import androidx.compose.material3.Checkbox
import androidx.compose.material3.Text
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.ExperimentalComposeUiApi
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.ui.window.ComposeViewport
import kotlinx.browser.document

@OptIn(ExperimentalComposeUiApi::class)
fun WasmApp() {

    ComposeViewport(document.body!!) {

        var mobile by remember {
            mutableStateOf(true)
        }

        Column(
            Modifier
                .let {
                    if (mobile) {
                        it.widthIn(max = 400.dp)
                    } else it
                }
                .fillMaxSize()
                .padding(24.dp)
        ) {

            Row(
                Modifier
                    .align(Alignment.End)
            ) {
                Checkbox(
                    checked = mobile,
                    onCheckedChange = {
                        mobile = it
                    }
                )
                Text("Mobile")
            }

            App()
        }
    }
}