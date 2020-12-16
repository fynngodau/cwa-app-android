package de.rki.coronawarnapp.ui.main.home.items.tracing

import de.rki.coronawarnapp.ui.main.home.items.HomeItem

interface TracingStateItem : HomeItem {
    override val stableId: Long
        get() = TracingStateItem::class.java.name.hashCode().toLong()
}
