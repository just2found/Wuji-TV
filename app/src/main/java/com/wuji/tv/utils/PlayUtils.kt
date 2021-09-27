package com.wuji.tv.utils

import android.content.Context
import android.content.Intent
import android.net.Uri
import java.io.File
import java.net.URLEncoder

fun play(session: String, ip: String, path: String, name: String, context: Context){
    val encode = URLEncoder.encode(path, "utf-8")
    val filePath = "http://${ip}/file/download?session=${session}&path=${encode}"
    Intent(Intent.ACTION_VIEW).apply {
        setDataAndType(Uri.fromFile(File(filePath)), "video/*")
        context.startActivity(this)
    }
}