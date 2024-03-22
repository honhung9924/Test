package com.example.loginform

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateListOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.loginform.ui.theme.LoginFormTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            LoginFormTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Greeting()
                }
            }
        }
    }
}

@Composable
fun Greeting() {
    Column(horizontalAlignment = Alignment.CenterHorizontally) {
        Text(
            text = "Đăng Nhập: ",

            )
        TextField()
        password()
        button()
    }

}
@Composable
fun TextField(){
    var name by remember {
        mutableStateOf("")
    }
  androidx.compose.material3.TextField(value = name, onValueChange = {newValue->name=newValue},
      textStyle = TextStyle(color= Color.Black, fontSize = 16.sp, fontWeight = FontWeight.Bold
      ),
      placeholder = { Text(text="nhập tên")},
      shape = RoundedCornerShape(16.dp),
  )

}
@Composable
fun password(){
    var password by remember {
        mutableStateOf("")
    }
    androidx.compose.material3.OutlinedTextField(value = password, onValueChange = {password=it},
        textStyle = TextStyle(color= Color.Black, fontSize = 16.sp, fontWeight = FontWeight.Bold
        ),
        placeholder = { Text(text="nhập mật khẩu")},
        shape = RoundedCornerShape(16.dp),
        visualTransformation = PasswordVisualTransformation()
    )

}
@Composable
fun button(){
    Button(onClick = { /*TODO*/ },
        shape = RoundedCornerShape(topStart = 15.dp, bottomEnd = 11.dp,)
    )
    {
        Text(text = "Đăng Nhập")


    }
}
@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    LoginFormTheme {
        Greeting()
    }
}