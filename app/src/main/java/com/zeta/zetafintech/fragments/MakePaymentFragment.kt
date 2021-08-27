package com.zeta.zetafintech.fragments

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.zeta.zetafintech.R
import com.zeta.zetafintech.Utils
import com.zeta.zetafintech.databinding.FragmentMakePaymentBinding
import com.zeta.zetafintech.models.account.Amount
import com.zeta.zetafintech.models.account.PaymentReq
import com.zeta.zetafintech.network.WebService

class MakePaymentFragment : Fragment() {

    private var _binding: FragmentMakePaymentBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {

        _binding = FragmentMakePaymentBinding.inflate(inflater, container, false)
        val root: View = binding.root

        Utils.blackIconsStatusBar(activity, R.color.light_bg)
        var amt = binding.amountpay.text.toString()
        var acc = binding.accNo.text.toString()
        binding.scanbutton.setOnClickListener {
            makePay(amt, acc)
        }
        return root
    }

    fun makePay(amt: String, acc: String){
        WebService.apiService.doPayment(PaymentReq(Amount(amt.toInt(),"INR"),null, acc, "b4fc13fd-3e0f-43c6-81c0-47ced3a00893","", "","", null))
    }
}