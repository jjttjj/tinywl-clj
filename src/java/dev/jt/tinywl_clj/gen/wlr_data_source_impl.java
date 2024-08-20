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
 * struct wlr_data_source_impl {
 *     void (*send)(struct wlr_data_source *, const char *, int32_t);
 *     void (*accept)(struct wlr_data_source *, uint32_t, const char *);
 *     void (*destroy)(struct wlr_data_source *);
 *     void (*dnd_drop)(struct wlr_data_source *);
 *     void (*dnd_finish)(struct wlr_data_source *);
 *     void (*dnd_action)(struct wlr_data_source *, enum wl_data_device_manager_dnd_action);
 * }
 * }
 */
public class wlr_data_source_impl {

    wlr_data_source_impl() {
        // Should not be called directly
    }

    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
        C.C_POINTER.withName("send"),
        C.C_POINTER.withName("accept"),
        C.C_POINTER.withName("destroy"),
        C.C_POINTER.withName("dnd_drop"),
        C.C_POINTER.withName("dnd_finish"),
        C.C_POINTER.withName("dnd_action")
    ).withName("wlr_data_source_impl");

    /**
     * The layout of this struct
     */
    public static final GroupLayout layout() {
        return $LAYOUT;
    }

    /**
     * {@snippet lang=c :
     * void (*send)(struct wlr_data_source *, const char *, int32_t)
     * }
     */
    public static class send {

        send() {
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

        private static final MethodHandle UP$MH = C.upcallHandle(send.Function.class, "apply", $DESC);

        /**
         * Allocates a new upcall stub, whose implementation is defined by {@code fi}.
         * The lifetime of the returned segment is managed by {@code arena}
         */
        public static MemorySegment allocate(send.Function fi, Arena arena) {
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

    private static final AddressLayout send$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("send"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * void (*send)(struct wlr_data_source *, const char *, int32_t)
     * }
     */
    public static final AddressLayout send$layout() {
        return send$LAYOUT;
    }

    private static final long send$OFFSET = 0;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * void (*send)(struct wlr_data_source *, const char *, int32_t)
     * }
     */
    public static final long send$offset() {
        return send$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * void (*send)(struct wlr_data_source *, const char *, int32_t)
     * }
     */
    public static MemorySegment send(MemorySegment struct) {
        return struct.get(send$LAYOUT, send$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * void (*send)(struct wlr_data_source *, const char *, int32_t)
     * }
     */
    public static void send(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(send$LAYOUT, send$OFFSET, fieldValue);
    }

    /**
     * {@snippet lang=c :
     * void (*accept)(struct wlr_data_source *, uint32_t, const char *)
     * }
     */
    public static class accept {

        accept() {
            // Should not be called directly
        }

        /**
         * The function pointer signature, expressed as a functional interface
         */
        public interface Function {
            void apply(MemorySegment _x0, int _x1, MemorySegment _x2);
        }

        private static final FunctionDescriptor $DESC = FunctionDescriptor.ofVoid(
            C.C_POINTER,
            C.C_INT,
            C.C_POINTER
        );

        /**
         * The descriptor of this function pointer
         */
        public static FunctionDescriptor descriptor() {
            return $DESC;
        }

        private static final MethodHandle UP$MH = C.upcallHandle(accept.Function.class, "apply", $DESC);

        /**
         * Allocates a new upcall stub, whose implementation is defined by {@code fi}.
         * The lifetime of the returned segment is managed by {@code arena}
         */
        public static MemorySegment allocate(accept.Function fi, Arena arena) {
            return Linker.nativeLinker().upcallStub(UP$MH.bindTo(fi), $DESC, arena);
        }

        private static final MethodHandle DOWN$MH = Linker.nativeLinker().downcallHandle($DESC);

        /**
         * Invoke the upcall stub {@code funcPtr}, with given parameters
         */
        public static void invoke(MemorySegment funcPtr,MemorySegment _x0, int _x1, MemorySegment _x2) {
            try {
                 DOWN$MH.invokeExact(funcPtr, _x0, _x1, _x2);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        }
    }

    private static final AddressLayout accept$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("accept"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * void (*accept)(struct wlr_data_source *, uint32_t, const char *)
     * }
     */
    public static final AddressLayout accept$layout() {
        return accept$LAYOUT;
    }

    private static final long accept$OFFSET = 8;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * void (*accept)(struct wlr_data_source *, uint32_t, const char *)
     * }
     */
    public static final long accept$offset() {
        return accept$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * void (*accept)(struct wlr_data_source *, uint32_t, const char *)
     * }
     */
    public static MemorySegment accept(MemorySegment struct) {
        return struct.get(accept$LAYOUT, accept$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * void (*accept)(struct wlr_data_source *, uint32_t, const char *)
     * }
     */
    public static void accept(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(accept$LAYOUT, accept$OFFSET, fieldValue);
    }

    /**
     * {@snippet lang=c :
     * void (*destroy)(struct wlr_data_source *)
     * }
     */
    public static class destroy {

        destroy() {
            // Should not be called directly
        }

        /**
         * The function pointer signature, expressed as a functional interface
         */
        public interface Function {
            void apply(MemorySegment _x0);
        }

        private static final FunctionDescriptor $DESC = FunctionDescriptor.ofVoid(
            C.C_POINTER
        );

        /**
         * The descriptor of this function pointer
         */
        public static FunctionDescriptor descriptor() {
            return $DESC;
        }

        private static final MethodHandle UP$MH = C.upcallHandle(destroy.Function.class, "apply", $DESC);

        /**
         * Allocates a new upcall stub, whose implementation is defined by {@code fi}.
         * The lifetime of the returned segment is managed by {@code arena}
         */
        public static MemorySegment allocate(destroy.Function fi, Arena arena) {
            return Linker.nativeLinker().upcallStub(UP$MH.bindTo(fi), $DESC, arena);
        }

        private static final MethodHandle DOWN$MH = Linker.nativeLinker().downcallHandle($DESC);

        /**
         * Invoke the upcall stub {@code funcPtr}, with given parameters
         */
        public static void invoke(MemorySegment funcPtr,MemorySegment _x0) {
            try {
                 DOWN$MH.invokeExact(funcPtr, _x0);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        }
    }

    private static final AddressLayout destroy$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("destroy"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * void (*destroy)(struct wlr_data_source *)
     * }
     */
    public static final AddressLayout destroy$layout() {
        return destroy$LAYOUT;
    }

    private static final long destroy$OFFSET = 16;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * void (*destroy)(struct wlr_data_source *)
     * }
     */
    public static final long destroy$offset() {
        return destroy$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * void (*destroy)(struct wlr_data_source *)
     * }
     */
    public static MemorySegment destroy(MemorySegment struct) {
        return struct.get(destroy$LAYOUT, destroy$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * void (*destroy)(struct wlr_data_source *)
     * }
     */
    public static void destroy(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(destroy$LAYOUT, destroy$OFFSET, fieldValue);
    }

    /**
     * {@snippet lang=c :
     * void (*dnd_drop)(struct wlr_data_source *)
     * }
     */
    public static class dnd_drop {

        dnd_drop() {
            // Should not be called directly
        }

        /**
         * The function pointer signature, expressed as a functional interface
         */
        public interface Function {
            void apply(MemorySegment _x0);
        }

        private static final FunctionDescriptor $DESC = FunctionDescriptor.ofVoid(
            C.C_POINTER
        );

        /**
         * The descriptor of this function pointer
         */
        public static FunctionDescriptor descriptor() {
            return $DESC;
        }

        private static final MethodHandle UP$MH = C.upcallHandle(dnd_drop.Function.class, "apply", $DESC);

        /**
         * Allocates a new upcall stub, whose implementation is defined by {@code fi}.
         * The lifetime of the returned segment is managed by {@code arena}
         */
        public static MemorySegment allocate(dnd_drop.Function fi, Arena arena) {
            return Linker.nativeLinker().upcallStub(UP$MH.bindTo(fi), $DESC, arena);
        }

        private static final MethodHandle DOWN$MH = Linker.nativeLinker().downcallHandle($DESC);

        /**
         * Invoke the upcall stub {@code funcPtr}, with given parameters
         */
        public static void invoke(MemorySegment funcPtr,MemorySegment _x0) {
            try {
                 DOWN$MH.invokeExact(funcPtr, _x0);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        }
    }

    private static final AddressLayout dnd_drop$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("dnd_drop"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * void (*dnd_drop)(struct wlr_data_source *)
     * }
     */
    public static final AddressLayout dnd_drop$layout() {
        return dnd_drop$LAYOUT;
    }

    private static final long dnd_drop$OFFSET = 24;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * void (*dnd_drop)(struct wlr_data_source *)
     * }
     */
    public static final long dnd_drop$offset() {
        return dnd_drop$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * void (*dnd_drop)(struct wlr_data_source *)
     * }
     */
    public static MemorySegment dnd_drop(MemorySegment struct) {
        return struct.get(dnd_drop$LAYOUT, dnd_drop$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * void (*dnd_drop)(struct wlr_data_source *)
     * }
     */
    public static void dnd_drop(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(dnd_drop$LAYOUT, dnd_drop$OFFSET, fieldValue);
    }

    /**
     * {@snippet lang=c :
     * void (*dnd_finish)(struct wlr_data_source *)
     * }
     */
    public static class dnd_finish {

        dnd_finish() {
            // Should not be called directly
        }

        /**
         * The function pointer signature, expressed as a functional interface
         */
        public interface Function {
            void apply(MemorySegment _x0);
        }

        private static final FunctionDescriptor $DESC = FunctionDescriptor.ofVoid(
            C.C_POINTER
        );

        /**
         * The descriptor of this function pointer
         */
        public static FunctionDescriptor descriptor() {
            return $DESC;
        }

        private static final MethodHandle UP$MH = C.upcallHandle(dnd_finish.Function.class, "apply", $DESC);

        /**
         * Allocates a new upcall stub, whose implementation is defined by {@code fi}.
         * The lifetime of the returned segment is managed by {@code arena}
         */
        public static MemorySegment allocate(dnd_finish.Function fi, Arena arena) {
            return Linker.nativeLinker().upcallStub(UP$MH.bindTo(fi), $DESC, arena);
        }

        private static final MethodHandle DOWN$MH = Linker.nativeLinker().downcallHandle($DESC);

        /**
         * Invoke the upcall stub {@code funcPtr}, with given parameters
         */
        public static void invoke(MemorySegment funcPtr,MemorySegment _x0) {
            try {
                 DOWN$MH.invokeExact(funcPtr, _x0);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        }
    }

    private static final AddressLayout dnd_finish$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("dnd_finish"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * void (*dnd_finish)(struct wlr_data_source *)
     * }
     */
    public static final AddressLayout dnd_finish$layout() {
        return dnd_finish$LAYOUT;
    }

    private static final long dnd_finish$OFFSET = 32;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * void (*dnd_finish)(struct wlr_data_source *)
     * }
     */
    public static final long dnd_finish$offset() {
        return dnd_finish$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * void (*dnd_finish)(struct wlr_data_source *)
     * }
     */
    public static MemorySegment dnd_finish(MemorySegment struct) {
        return struct.get(dnd_finish$LAYOUT, dnd_finish$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * void (*dnd_finish)(struct wlr_data_source *)
     * }
     */
    public static void dnd_finish(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(dnd_finish$LAYOUT, dnd_finish$OFFSET, fieldValue);
    }

    /**
     * {@snippet lang=c :
     * void (*dnd_action)(struct wlr_data_source *, enum wl_data_device_manager_dnd_action)
     * }
     */
    public static class dnd_action {

        dnd_action() {
            // Should not be called directly
        }

        /**
         * The function pointer signature, expressed as a functional interface
         */
        public interface Function {
            void apply(MemorySegment _x0, int _x1);
        }

        private static final FunctionDescriptor $DESC = FunctionDescriptor.ofVoid(
            C.C_POINTER,
            C.C_INT
        );

        /**
         * The descriptor of this function pointer
         */
        public static FunctionDescriptor descriptor() {
            return $DESC;
        }

        private static final MethodHandle UP$MH = C.upcallHandle(dnd_action.Function.class, "apply", $DESC);

        /**
         * Allocates a new upcall stub, whose implementation is defined by {@code fi}.
         * The lifetime of the returned segment is managed by {@code arena}
         */
        public static MemorySegment allocate(dnd_action.Function fi, Arena arena) {
            return Linker.nativeLinker().upcallStub(UP$MH.bindTo(fi), $DESC, arena);
        }

        private static final MethodHandle DOWN$MH = Linker.nativeLinker().downcallHandle($DESC);

        /**
         * Invoke the upcall stub {@code funcPtr}, with given parameters
         */
        public static void invoke(MemorySegment funcPtr,MemorySegment _x0, int _x1) {
            try {
                 DOWN$MH.invokeExact(funcPtr, _x0, _x1);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        }
    }

    private static final AddressLayout dnd_action$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("dnd_action"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * void (*dnd_action)(struct wlr_data_source *, enum wl_data_device_manager_dnd_action)
     * }
     */
    public static final AddressLayout dnd_action$layout() {
        return dnd_action$LAYOUT;
    }

    private static final long dnd_action$OFFSET = 40;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * void (*dnd_action)(struct wlr_data_source *, enum wl_data_device_manager_dnd_action)
     * }
     */
    public static final long dnd_action$offset() {
        return dnd_action$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * void (*dnd_action)(struct wlr_data_source *, enum wl_data_device_manager_dnd_action)
     * }
     */
    public static MemorySegment dnd_action(MemorySegment struct) {
        return struct.get(dnd_action$LAYOUT, dnd_action$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * void (*dnd_action)(struct wlr_data_source *, enum wl_data_device_manager_dnd_action)
     * }
     */
    public static void dnd_action(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(dnd_action$LAYOUT, dnd_action$OFFSET, fieldValue);
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
