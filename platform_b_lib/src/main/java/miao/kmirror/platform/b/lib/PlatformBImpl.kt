package miao.kmirror.platform.b.lib

import android.util.Log
import com.google.auto.service.AutoService
import miao.kmirror.comlib.ComInterface


@AutoService(ComInterface::class)
class PlatformBImpl : ComInterface {
    override fun doSomething() {
        Log.d("Kmirror", "doSomething: PlatformBImpl")
    }
}