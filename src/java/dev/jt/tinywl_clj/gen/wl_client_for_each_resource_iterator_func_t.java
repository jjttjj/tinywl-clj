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
 * typedef enum wl_iterator_result {
 *     WL_ITERATOR_STOP,
 *     WL_ITERATOR_CONTINUE
 * } (*wl_client_for_each_resource_iterator_func_t)(struct wl_resource {
 *     struct wl_object object;
 *     wl_resource_destroy_func_t destroy;
 *     struct wl_list link;
 *     struct wl_signal destroy_signal;
 *     struct wl_client *client;
 *     void *data;
 * } *, void *)
 * }
 */
public class wl_client_for_each_resource_iterator_func_t {

    wl_client_for_each_resource_iterator_func_t() {
        // Should not be called directly
    }

    /**
     * The function pointer signature, expressed as a functional interface
     */
    public interface Function {
        int apply(MemorySegment resource, MemorySegment user_data);
    }

    private static final FunctionDescriptor $DESC = FunctionDescriptor.of(
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

    private static final MethodHandle UP$MH = C.upcallHandle(wl_client_for_each_resource_iterator_func_t.Function.class, "apply", $DESC);

    /**
     * Allocates a new upcall stub, whose implementation is defined by {@code fi}.
     * The lifetime of the returned segment is managed by {@code arena}
     */
    public static MemorySegment allocate(wl_client_for_each_resource_iterator_func_t.Function fi, Arena arena) {
        return Linker.nativeLinker().upcallStub(UP$MH.bindTo(fi), $DESC, arena);
    }

    private static final MethodHandle DOWN$MH = Linker.nativeLinker().downcallHandle($DESC);

    /**
     * Invoke the upcall stub {@code funcPtr}, with given parameters
     */
    public static int invoke(MemorySegment funcPtr,MemorySegment resource, MemorySegment user_data) {
        try {
            return (int) DOWN$MH.invokeExact(funcPtr, resource, user_data);
        } catch (Throwable ex$) {
            throw new AssertionError("should not reach here", ex$);
        }
    }
}

