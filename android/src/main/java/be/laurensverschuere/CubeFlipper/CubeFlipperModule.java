
package be.laurensverschuere.CubeFlipper;

import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;

public class CubeFlipperModule extends ReactContextBaseJavaModule {

  public CubeFlipperModule(ReactApplicationContext reactContext) {
    super(reactContext);
  }

  @Override
  public String getName() {
    return CubeFlipperViewManager.REACT_CLASS;
  }

  @Override public void initialize() {
    super.initialize();
  }
}