package dominando.android.navigationapi

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import dominando.android.navigationapi.databinding.FragmentCompleteBinding

class CompleteFragment : Fragment() {

    private var _binding: FragmentCompleteBinding? = null
    private val binding: FragmentCompleteBinding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ) = FragmentCompleteBinding.inflate(inflater, container, false).apply {
        _binding = this
    }.root

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        arguments?.run {
            val fullName = getString("full_name")
            val age = getInt("age")
            binding.txtMessage.text = "$fullName - $age"
        }
    }

    override fun onDestroy() {
        super.onDestroy()
        _binding = null
    }
}