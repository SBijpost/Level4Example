package com.sem.level3task2

import android.os.Parcel
import android.os.Parcelable

data class Portal(
    var portalTitle: String?,
    var portalUrl: String?
) : Parcelable {
    constructor(parcel: Parcel) : this(
        parcel.readString(),
        parcel.readString()
    ) {
    }

    override fun writeToParcel(parcel: Parcel, flags: Int) {
        parcel.writeString(portalTitle)
        parcel.writeString(portalUrl)
    }

    override fun describeContents(): Int {
        return 0
    }

    companion object CREATOR : Parcelable.Creator<Portal> {
        override fun createFromParcel(parcel: Parcel): Portal {
            return Portal(parcel)
        }

        override fun newArray(size: Int): Array<Portal?> {
            return arrayOfNulls(size)
        }
    }
}
