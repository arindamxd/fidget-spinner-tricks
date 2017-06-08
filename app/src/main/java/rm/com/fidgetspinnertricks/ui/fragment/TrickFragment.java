package rm.com.fidgetspinnertricks.ui.fragment;

import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import rm.com.fidgetspinnertricks.R;

/**
 * Created by alex
 */

public final class TrickFragment extends BaseFragment {

  public static TrickFragment newInstance() {
    return new TrickFragment();
  }

  @Nullable @Override
  public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container,
      @Nullable Bundle savedInstanceState) {
    return inflater.inflate(R.layout.fragment_trick, container, false);
  }

  @Override public void onViewCreated(View view, Bundle savedInstanceState) {
    super.onViewCreated(view, savedInstanceState);
  }

  @Override protected int orientation() {
    return ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE;
  }

  @NonNull @Override String title() {
    return "Трюк #2";
  }

  @Override boolean hasBackButton() {
    return true;
  }

  @Override boolean isNested() {
    return false;
  }
}