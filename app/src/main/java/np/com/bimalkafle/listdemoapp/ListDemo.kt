package np.com.bimalkafle.listdemoapp

import android.R
import android.util.Log
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun ListDemo(){
    LazyColumnDemo()
}

@Composable
fun LazyColumnDemo(){
    var myList = listOf<Int>(1,2,3,4,5,6)
    LazyColumn(content = {
        itemsIndexed(myList, itemContent = {index, item ->
            TextItem(text = "item $item")
        })
        })

}

@Composable
fun SimpleColumn(){
    var scrollState = rememberScrollState()
    Column(
        modifier = Modifier.verticalScroll(scrollState)
    ) {
        for (i in 1..100){
            TextItem(text = "Item $i")
        }
    }
}

@Composable
fun TextItem(text: String){
    Log.i("TEXTITEM RENDER-->", text)
    Text(text = text,
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),
        textAlign = TextAlign.Center,
        fontSize = 20.sp
    )

}