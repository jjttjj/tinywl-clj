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
 * struct wl_display_interface {
 *     void (*sync)(struct wl_client *, struct wl_resource *, uint32_t);
 *     void (*get_registry)(struct wl_client *, struct wl_resource *, uint32_t);
 * }
 * }
 */
public class wl_display_interface {

    wl_display_interface() {
        // Should not be called directly
    }

    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
        C.C_POINTER.withName("sync"),
        C.C_POINTER.withName("get_registry")
    ).withName("wl_display_interface");

    /**
     * The layout of this struct
     */
    public static final GroupLayout layout() {
        return $LAYOUT;
    }

    /**
     * {@snippet lang=c :
     * void (*sync)(struct wl_client *, struct wl_resource *, uint32_t)
     * }
     */
    public static class sync {

        sync() {
            // Should not be called directly
        }

        /**
         * The function pointer signature, expressed as a functional interface
         */
        public interface Function {
            void apply(MemorySegment _x0, MemorySegment _x1, int _x2);
        }

        private static final FunctionDescriptor $DESC = FunctionDescriptor.ofVoid(
            C.C_POINTER,
            C.C_POINTER,
            C.C_INT
        );

        /**
         * The descriptor of this function pointer
         */
        public static FunctionDescriptor descriptor() {
            return $DESC;
        }

        private static final MethodHandle UP$MH = C.upcallHandle(sync.Function.class, "apply", $DESC);

        /**
         * Allocates a new upcall stub, whose implementation is defined by {@code fi}.
         * The lifetime of the returned segment is managed by {@code arena}
         */
        public static MemorySegment allocate(sync.Function fi, Arena arena) {
            return Linker.nativeLinker().upcallStub(UP$MH.bindTo(fi), $DESC, arena);
        }

        private static final MethodHandle DOWN$MH = Linker.nativeLinker().downcallHandle($DESC);

        /**
         * Invoke the upcall stub {@code funcPtr}, with given parameters
         */
        public static void invoke(MemorySegment funcPtr,MemorySegment _x0, MemorySegment _x1, int _x2) {
            try {
                 DOWN$MH.invokeExact(funcPtr, _x0, _x1, _x2);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        }
    }

    private static final AddressLayout sync$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("sync"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * void (*sync)(struct wl_client *, struct wl_resource *, uint32_t)
     * }
     */
    public static final AddressLayout sync$layout() {
        return sync$LAYOUT;
    }

    private static final long sync$OFFSET = 0;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * void (*sync)(struct wl_client *, struct wl_resource *, uint32_t)
     * }
     */
    public static final long sync$offset() {
        return sync$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * void (*sync)(struct wl_client *, struct wl_resource *, uint32_t)
     * }
     */
    public static MemorySegment sync(MemorySegment struct) {
        return struct.get(sync$LAYOUT, sync$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * void (*sync)(struct wl_client *, struct wl_resource *, uint32_t)
     * }
     */
    public static void sync(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(sync$LAYOUT, sync$OFFSET, fieldValue);
    }

    /**
     * {@snippet lang=c :
     * void (*get_registry)(struct wl_client *, struct wl_resource *, uint32_t)
     * }
     */
    public static class get_registry {

        get_registry() {
            // Should not be called directly
        }

        /**
         * The function pointer signature, expressed as a functional interface
         */
        public interface Function {
            void apply(MemorySegment _x0, MemorySegment _x1, int _x2);
        }

        private static final FunctionDescriptor $DESC = FunctionDescriptor.ofVoid(
            C.C_POINTER,
            C.C_POINTER,
            C.C_INT
        );

        /**
         * The descriptor of this function pointer
         */
        public static FunctionDescriptor descriptor() {
            return $DESC;
        }

        private static final MethodHandle UP$MH = C.upcallHandle(get_registry.Function.class, "apply", $DESC);

        /**
         * Allocates a new upcall stub, whose implementation is defined by {@code fi}.
         * The lifetime of the returned segment is managed by {@code arena}
         */
        public static MemorySegment allocate(get_registry.Function fi, Arena arena) {
            return Linker.nativeLinker().upcallStub(UP$MH.bindTo(fi), $DESC, arena);
        }

        private static final MethodHandle DOWN$MH = Linker.nativeLinker().downcallHandle($DESC);

        /**
         * Invoke the upcall stub {@code funcPtr}, with given parameters
         */
        public static void invoke(MemorySegment funcPtr,MemorySegment _x0, MemorySegment _x1, int _x2) {
            try {
                 DOWN$MH.invokeExact(funcPtr, _x0, _x1, _x2);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        }
    }

    private static final AddressLayout get_registry$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("get_registry"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * void (*get_registry)(struct wl_client *, struct wl_resource *, uint32_t)
     * }
     */
    public static final AddressLayout get_registry$layout() {
        return get_registry$LAYOUT;
    }

    private static final long get_registry$OFFSET = 8;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * void (*get_registry)(struct wl_client *, struct wl_resource *, uint32_t)
     * }
     */
    public static final long get_registry$offset() {
        return get_registry$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * void (*get_registry)(struct wl_client *, struct wl_resource *, uint32_t)
     * }
     */
    public static MemorySegment get_registry(MemorySegment struct) {
        return struct.get(get_registry$LAYOUT, get_registry$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * void (*get_registry)(struct wl_client *, struct wl_resource *, uint32_t)
     * }
     */
    public static void get_registry(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(get_registry$LAYOUT, get_registry$OFFSET, fieldValue);
    }

    /**
     * Obtains a slice of {@code arrayParam} which selects the array element at {@code index}.
     * The returned segment has address {@code arrayParam.address() + index * layout().byteSize()}
     */
    public static MemorySegment asSlice(MemorySegment array, long index) {
        return array.asSlice(layout().byteSize() * index);
    }

    /**
     * The size (in bytes) of this struct
     */
    public static long sizeof() { return layout().byteSize(); }

    /**
     * Allocate a segment of size {@code layout().byteSize()} using {@code allocator}
     */
    public static MemorySegment allocate(SegmentAllocator allocator) {
        return allocator.allocate(layout());
    }

    /**
     * Allocate an array of size {@code elementCount} using {@code allocator}.
     * The returned segment has size {@code elementCount * layout().byteSize()}.
     */
    public static MemorySegment allocateArray(long elementCount, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(elementCount, layout()));
    }

    /**
     * Reinterprets {@code addr} using target {@code arena} and {@code cleanupAction} (if any).
     * The returned segment has size {@code layout().byteSize()}
     */
    public static MemorySegment reinterpret(MemorySegment addr, Arena arena, Consumer<MemorySegment> cleanup) {
        return reinterpret(addr, 1, arena, cleanup);
    }

    /**
     * Reinterprets {@code addr} using target {@code arena} and {@code cleanupAction} (if any).
     * The returned segment has size {@code elementCount * layout().byteSize()}
     */
    public static MemorySegment reinterpret(MemorySegment addr, long elementCount, Arena arena, Consumer<MemorySegment> cleanup) {
        return addr.reinterpret(layout().byteSize() * elementCount, arena, cleanup);
    }
}

