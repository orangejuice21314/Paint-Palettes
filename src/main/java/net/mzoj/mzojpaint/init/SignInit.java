package net.mzoj.mzojpaint.init;

import net.minecraft.util.SignType;
import net.mzoj.mzojpaint.mixin.SignTypeAccessor;

public class SignInit {
    public static final SignType WALLPAPER =
            SignTypeAccessor.registerNew(SignTypeAccessor.newSignType("wallpaper"));
    public static final SignType BLACK =
            SignTypeAccessor.registerNew(SignTypeAccessor.newSignType("black"));
    public static final SignType BLUE =
            SignTypeAccessor.registerNew(SignTypeAccessor.newSignType("blue"));
    public static final SignType BROWN =
            SignTypeAccessor.registerNew(SignTypeAccessor.newSignType("brown"));
    public static final SignType CYAN =
            SignTypeAccessor.registerNew(SignTypeAccessor.newSignType("cyan"));
    public static final SignType GRAY =
            SignTypeAccessor.registerNew(SignTypeAccessor.newSignType("gray"));
    public static final SignType GREEN =
            SignTypeAccessor.registerNew(SignTypeAccessor.newSignType("green"));
    public static final SignType LIGHT_BLUE =
            SignTypeAccessor.registerNew(SignTypeAccessor.newSignType("light_blue"));
    public static final SignType LIGHT_GRAY =
            SignTypeAccessor.registerNew(SignTypeAccessor.newSignType("light_gray"));
    public static final SignType LIME =
            SignTypeAccessor.registerNew(SignTypeAccessor.newSignType("lime"));
    public static final SignType MAGENTA =
            SignTypeAccessor.registerNew(SignTypeAccessor.newSignType("magenta"));
    public static final SignType ORANGE =
            SignTypeAccessor.registerNew(SignTypeAccessor.newSignType("orange"));
    public static final SignType PINK =
            SignTypeAccessor.registerNew(SignTypeAccessor.newSignType("pink"));
    public static final SignType PURPLE =
            SignTypeAccessor.registerNew(SignTypeAccessor.newSignType("purple"));
    public static final SignType RED =
            SignTypeAccessor.registerNew(SignTypeAccessor.newSignType("red"));
    public static final SignType WHITE =
            SignTypeAccessor.registerNew(SignTypeAccessor.newSignType("white"));
    public static final SignType YELLOW =
            SignTypeAccessor.registerNew(SignTypeAccessor.newSignType("yellow"));
}
