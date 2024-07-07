package miao.kmirror.platform.a.lib

import android.util.Log
import com.google.auto.service.AutoService
import miao.kmirror.comlib.ComInterface


@AutoService(ComInterface::class)
class PlatformAImpl : ComInterface {
    override fun doSomething() {
        Log.d("Kmirror", "doSomething: PlatformAImpl")
    }
}