package de.rki.coronawarnapp.ui.tracing.details.items.risk

import android.view.ViewGroup
import androidx.annotation.LayoutRes
import de.rki.coronawarnapp.R
import de.rki.coronawarnapp.databinding.TracingContentIncreasedViewBinding
import de.rki.coronawarnapp.tracing.ui.states.IncreasedRisk
import de.rki.coronawarnapp.ui.tracing.details.TracingDetailsAdapter
import de.rki.coronawarnapp.ui.tracing.details.items.risk.IncreasedRiskBox.Item

class IncreasedRiskBox(
    parent: ViewGroup, @LayoutRes containerLayout: Int = R.layout.tracing_details_item_container_layout
) : TracingDetailsAdapter.DetailsItemVH<Item, TracingContentIncreasedViewBinding>(containerLayout, parent) {

    override val viewBinding = lazy {
        TracingContentIncreasedViewBinding.inflate(layoutInflater, itemView.findViewById(R.id.box_container), true)
    }

    override val onBindData: TracingContentIncreasedViewBinding.(item: Item) -> Unit = { item ->
        state = item.state
    }

    data class Item(
        val state: IncreasedRisk
    ) : RiskStateItem
}
