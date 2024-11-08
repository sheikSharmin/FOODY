package com.michael.foody.ui.fragments.recipes

import android.os.Bundle
import android.os.Parcelable
import androidx.navigation.ActionOnlyNavDirections
import androidx.navigation.NavDirections
import com.michael.foody.R
import com.michael.foody.models.Result
import java.io.Serializable
import java.lang.UnsupportedOperationException
import kotlin.Int
import kotlin.Suppress

public class RecipesFragmentDirections private constructor() {
  private data class ActionRecipesFragmentToDetailsActivity(
    public val result: Result,
  ) : NavDirections {
    public override val actionId: Int = R.id.action_recipesFragment_to_detailsActivity

    public override val arguments: Bundle
      @Suppress("CAST_NEVER_SUCCEEDS")
      get() {
        val result = Bundle()
        if (Parcelable::class.java.isAssignableFrom(Result::class.java)) {
          result.putParcelable("result", this.result as Parcelable)
        } else if (Serializable::class.java.isAssignableFrom(Result::class.java)) {
          result.putSerializable("result", this.result as Serializable)
        } else {
          throw UnsupportedOperationException(Result::class.java.name +
              " must implement Parcelable or Serializable or must be an Enum.")
        }
        return result
      }
  }

  public companion object {
    public fun actionRecipesFragmentToRecipesBottomSheet(): NavDirections =
        ActionOnlyNavDirections(R.id.action_recipesFragment_to_recipesBottomSheet)

    public fun actionRecipesFragmentToDetailsActivity(result: Result): NavDirections =
        ActionRecipesFragmentToDetailsActivity(result)
  }
}
