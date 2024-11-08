package com.michael.foody.ui.fragments.recipes

import android.os.Bundle
import androidx.lifecycle.SavedStateHandle
import androidx.navigation.NavArgs
import java.lang.IllegalArgumentException
import kotlin.Boolean
import kotlin.jvm.JvmStatic

public data class RecipesFragmentArgs(
  public val backFromBottomSheet: Boolean = false,
) : NavArgs {
  public fun toBundle(): Bundle {
    val result = Bundle()
    result.putBoolean("backFromBottomSheet", this.backFromBottomSheet)
    return result
  }

  public fun toSavedStateHandle(): SavedStateHandle {
    val result = SavedStateHandle()
    result.set("backFromBottomSheet", this.backFromBottomSheet)
    return result
  }

  public companion object {
    @JvmStatic
    public fun fromBundle(bundle: Bundle): RecipesFragmentArgs {
      bundle.setClassLoader(RecipesFragmentArgs::class.java.classLoader)
      val __backFromBottomSheet : Boolean
      if (bundle.containsKey("backFromBottomSheet")) {
        __backFromBottomSheet = bundle.getBoolean("backFromBottomSheet")
      } else {
        __backFromBottomSheet = false
      }
      return RecipesFragmentArgs(__backFromBottomSheet)
    }

    @JvmStatic
    public fun fromSavedStateHandle(savedStateHandle: SavedStateHandle): RecipesFragmentArgs {
      val __backFromBottomSheet : Boolean?
      if (savedStateHandle.contains("backFromBottomSheet")) {
        __backFromBottomSheet = savedStateHandle["backFromBottomSheet"]
        if (__backFromBottomSheet == null) {
          throw IllegalArgumentException("Argument \"backFromBottomSheet\" of type boolean does not support null values")
        }
      } else {
        __backFromBottomSheet = false
      }
      return RecipesFragmentArgs(__backFromBottomSheet)
    }
  }
}
