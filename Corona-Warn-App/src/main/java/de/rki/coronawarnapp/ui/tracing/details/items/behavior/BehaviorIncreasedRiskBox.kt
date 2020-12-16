package de.rki.coronawarnapp.ui.tracing.details.items.behavior

import android.view.ViewGroup
import androidx.annotation.LayoutRes
import de.rki.coronawarnapp.R
import de.rki.coronawarnapp.databinding.TracingDetailsItemBehaviorIncreasedViewBinding
import de.rki.coronawarnapp.ui.tracing.details.TracingDetailsAdapter
import de.rki.coronawarnapp.ui.tracing.details.items.behavior.BehaviorIncreasedRiskBox.Item

class BehaviorIncreasedRiskBox(
    parent: ViewGroup, @LayoutRes containerLayout: Int = R.layout.tracing_details_item_container_layout
) : TracingDetailsAdapter.DetailsItemVH<Item, TracingDetailsItemBehaviorIncreasedViewBinding>(containerLayout, parent) {

    override val viewBinding = lazy {
        TracingDetailsItemBehaviorIncreasedViewBinding.inflate(
            layoutInflater,
            itemView.findViewById(R.id.box_container),
            true
        )
    }

    override val onBindData: TracingDetailsItemBehaviorIncreasedViewBinding.(item: Item) -> Unit = { item ->

    }

    object Item : BehaviorItem
}
