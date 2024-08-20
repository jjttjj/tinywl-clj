// Generated by jextract

package dev.jt.tinywl_clj.gen;

import java.lang.invoke.*;
import java.lang.foreign.*;
import java.nio.ByteOrder;
import java.util.*;
import java.util.function.*;
import java.util.stream.*;

import static java.lang.foreign.ValueLayout.*;
import static java.lang.foreign.MemoryLayout.PathElement.*;

/**
 * {@snippet lang=c :
 * typedef void (*wlr_log_func_t)(enum wlr_log_importance {
 *     WLR_SILENT = 0,
 *     WLR_ERROR = 1,
 *     WLR_INFO = 2,
 *     WLR_DEBUG = 3,
 *     WLR_LOG_IMPORTANCE_LAST
 * }, const char *, struct __va_list_tag {
 *     unsigned int gp_offset;
 *     unsigned int fp_offset;
 *     void *overflow_arg_area;
 *     void *reg_save_area;
 * } *)
 * }
 */
public class wlr_log_func_t {

    wlr_log_func_t() {
        // Should not be called directly
    }

    /**
     * The function pointer signature, expressed as a functional interface
     */
    public interface Function {
        void apply(int importance, MemorySegment fmt, MemorySegment args);
    }

    private static final FunctionDescriptor $DESC = FunctionDescriptor.ofVoid(
        C.C_INT,
        C.C_POINTER,
        C.C_POINTER
    );

    /**
     * The descriptor of this function pointer
     */
    public static FunctionDescriptor descriptor() {
        return $DESC;
    }

    private static final MethodHandle UP$MH = C.upcallHandle(wlr_log_func_t.Function.class, "apply", $DESC);

    /**
     * Allocates a new upcall stub, whose implementation is defined by {@code fi}.
     * The lifetime of the returned segment is managed by {@code arena}
     */
    public static MemorySegment allocate(wlr_log_func_t.Function fi, Arena arena) {
        return Linker.nativeLinker().upcallStub(UP$MH.bindTo(fi), $DESC, arena);
    }

    private static final MethodHandle DOWN$MH = Linker.nativeLinker().downcallHandle($DESC);

    /**
     * Invoke the upcall stub {@code funcPtr}, with given parameters
     */
    public static void invoke(MemorySegment funcPtr,int importance, MemorySegment fmt, MemorySegment args) {
        try {
             DOWN$MH.invokeExact(funcPtr, importance, fmt, args);
        } catch (Throwable ex$) {
            throw new AssertionError("should not reach here", ex$);
        }
    }
}
