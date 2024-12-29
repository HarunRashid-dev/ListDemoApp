package np.com.bimalkafle.listdemoapp

import android.R
import android.graphics.Paint
import android.util.Log
import android.widget.Toast
import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.scale
import androidx.compose.ui.modifier.modifierLocalOf
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.core.util.Pools
import org.w3c.dom.Text
import java.nio.file.WatchEvent



@Composable
fun ListDemo(){
    LazyColumnDemo()
}

@Composable
fun LazyColumnDemo(){
    var myList = getAllMarvelChars()
    LazyColumn(content = {
        itemsIndexed(myList, itemContent = {index, item ->
            MarvelItem(item = item)
        })
        },
        modifier = Modifier.padding(top = 25.dp))
}

@Composable
fun MarvelItem(item : MarvelChar){
    var context = LocalContext.current
    Row(
        modifier = Modifier.fillMaxWidth()
            .padding(16.dp)
            .clickable{
                Toast.makeText(context,"Clicked ${item.name}",Toast.LENGTH_SHORT).show()
            }
    ) {
        Image(painter = painterResource(id = item.imageRes),
            contentDescription = item.name,
            modifier = Modifier
                .clip(CircleShape)
                .size(64.dp)
                .scale(1.0f)
            )
        Column(
            modifier = Modifier.fillMaxWidth()
                .padding(8.dp),
            horizontalAlignment = Alignment.Start
        ) {
            Text(
                text = item.chatName,
                style = TextStyle(fontSize = 22.sp, fontWeight = FontWeight.Bold)
            )
            Text(
                text = item.name,
                style = TextStyle(fontSize = 18.sp)
            )
        }
        }
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