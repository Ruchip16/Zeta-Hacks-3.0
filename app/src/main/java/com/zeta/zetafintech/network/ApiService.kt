package com.zeta.zetafintech.network

import com.zeta.zetafintech.models.account.AccountDetails
import com.zeta.zetafintech.models.account.PaymentReq
import com.zeta.zetafintech.models.account.PaymentRes
import retrofit2.Call
import retrofit2.http.*

interface ApiService {

    // Sample POST request for reference
    @Headers(
        "X-Zeta-AuthToken:eyJlbmMiOiJBMTI4Q0JDLUhTMjU2IiwidGFnIjoicmZCOEpDZld4N0dxYkVib2FWWEFUQSIsImFsZyI6IkExMjhHQ01LVyIsIml2IjoiZlNyakYxZDFOaXFVZkFiZiJ9.8bZ8VWzecCgA-JIXC1HSkPfsf0qTxVwpl3IG5_ZXEv8.2dMBi1C9cfiPj4kI-leV0w.tI9Jd9aDBx_IUUCPOFr3_vZjlSWy5ldjW4fXOGXtw8IN06NSL9Lzm36DicFHNGe6lZ1nsEW2pWdlQEbK_3iNIG051ZS5KNgyCM3eocO7r07DrGfEF7or3DrV3QzHfHd1WwzkYOuK2vi2hbYSYYllFj48Dorbn0lnZVOi6EOY81eOqXv-uLZk77iEV_B8kXeijpvBcaGxOR68Rkr15xaNYKiEFzKIrSd-Ng0z-6K0SXgZAs3C5WUz0ENC1HKEvCYEMf1aXjH2VI20r4pjnG0FSiTrvyPz8m6hcuJSu9DuktZKRFcm"

    )
    @POST("transfers")
    fun doPayment(@Body loginRequest: PaymentReq): Call<PaymentRes>

}