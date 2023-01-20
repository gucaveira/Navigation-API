package dominando.android.navigationapi

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.Navigation
import dominando.android.navigationapi.databinding.FragmentHomeBinding

class HomeFragment : Fragment() {

    private var _binding: FragmentHomeBinding? = null
    private val binding: FragmentHomeBinding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ) = FragmentHomeBinding.inflate(inflater, container, false).apply {
        _binding = this
    }.root

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        //essa forma é melhor usado para quando o navigation está dentro do click de botao
        binding.btnGo.setOnClickListener(
            Navigation.createNavigateOnClickListener(R.id.action_homeFragment_to_completeFragment)
        )

        // forma mais generica
        /*binding.btnGo.setOnClickListener {
            Navigation.findNavController(requireActivity(), R.id.navHostFragment)
                .navigate(R.id.action_homeFragment_to_completeFragment)
        }*/
    }

    override fun onDestroy() {
        super.onDestroy()
        _binding = null
    }
}