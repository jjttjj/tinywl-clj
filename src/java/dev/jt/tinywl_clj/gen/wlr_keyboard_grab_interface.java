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
 * struct wlr_keyboard_grab_interface {
 *     void (*enter)(struct wlr_seat_keyboard_grab *, struct wlr_surface *, const uint32_t *, size_t, const struct wlr_keyboard_modifiers *);
 *     void (*clear_focus)(struct wlr_seat_keyboard_grab *);
 *     void (*key)(struct wlr_seat_keyboard_grab *, uint32_t, uint32_t, uint32_t);
 *     void (*modifiers)(struct wlr_seat_keyboard_grab *, const struct wlr_keyboard_modifiers *);
 *     void (*cancel)(struct wlr_seat_keyboard_grab *);
 * }
 * }
 */
public class wlr_keyboard_grab_interface {

    wlr_keyboard_grab_interface() {
        // Should not be called directly
    }

    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
        C.C_POINTER.withName("enter"),
        C.C_POINTER.withName("clear_focus"),
        C.C_POINTER.withName("key"),
        C.C_POINTER.withName("modifiers"),
        C.C_POINTER.withName("cancel")
    ).withName("wlr_keyboard_grab_interface");

    /**
     * The layout of this struct
     */
    public static final GroupLayout layout() {
        return $LAYOUT;
    }

    /**
     * {@snippet lang=c :
     * void (*enter)(struct wlr_seat_keyboard_grab *, struct wlr_surface *, const uint32_t *, size_t, const struct wlr_keyboard_modifiers *)
     * }
     */
    public static class enter {

        enter() {
            // Should not be called directly
        }

        /**
         * The function pointer signature, expressed as a functional interface
         */
        public interface Function {
            void apply(MemorySegment _x0, MemorySegment _x1, MemorySegment _x2, long _x3, MemorySegment _x4);
        }

        private static final FunctionDescriptor $DESC = FunctionDescriptor.ofVoid(
            C.C_POINTER,
            C.C_POINTER,
            C.C_POINTER,
            C.C_LONG,
            C.C_POINTER
        );

        /**
         * The descriptor of this function pointer
         */
        public static FunctionDescriptor descriptor() {
            return $DESC;
        }

        private static final MethodHandle UP$MH = C.upcallHandle(enter.Function.class, "apply", $DESC);

        /**
         * Allocates a new upcall stub, whose implementation is defined by {@code fi}.
         * The lifetime of the returned segment is managed by {@code arena}
         */
        public static MemorySegment allocate(enter.Function fi, Arena arena) {
            return Linker.nativeLinker().upcallStub(UP$MH.bindTo(fi), $DESC, arena);
        }

        private static final MethodHandle DOWN$MH = Linker.nativeLinker().downcallHandle($DESC);

        /**
         * Invoke the upcall stub {@code funcPtr}, with given parameters
         */
        public static void invoke(MemorySegment funcPtr,MemorySegment _x0, MemorySegment _x1, MemorySegment _x2, long _x3, MemorySegment _x4) {
            try {
                 DOWN$MH.invokeExact(funcPtr, _x0, _x1, _x2, _x3, _x4);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        }
    }

    private static final AddressLayout enter$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("enter"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * void (*enter)(struct wlr_seat_keyboard_grab *, struct wlr_surface *, const uint32_t *, size_t, const struct wlr_keyboard_modifiers *)
     * }
     */
    public static final AddressLayout enter$layout() {
        return enter$LAYOUT;
    }

    private static final long enter$OFFSET = 0;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * void (*enter)(struct wlr_seat_keyboard_grab *, struct wlr_surface *, const uint32_t *, size_t, const struct wlr_keyboard_modifiers *)
     * }
     */
    public static final long enter$offset() {
        return enter$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * void (*enter)(struct wlr_seat_keyboard_grab *, struct wlr_surface *, const uint32_t *, size_t, const struct wlr_keyboard_modifiers *)
     * }
     */
    public static MemorySegment enter(MemorySegment struct) {
        return struct.get(enter$LAYOUT, enter$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * void (*enter)(struct wlr_seat_keyboard_grab *, struct wlr_surface *, const uint32_t *, size_t, const struct wlr_keyboard_modifiers *)
     * }
     */
    public static void enter(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(enter$LAYOUT, enter$OFFSET, fieldValue);
    }

    /**
     * {@snippet lang=c :
     * void (*clear_focus)(struct wlr_seat_keyboard_grab *)
     * }
     */
    public static class clear_focus {

        clear_focus() {
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

        private static final MethodHandle UP$MH = C.upcallHandle(clear_focus.Function.class, "apply", $DESC);

        /**
         * Allocates a new upcall stub, whose implementation is defined by {@code fi}.
         * The lifetime of the returned segment is managed by {@code arena}
         */
        public static MemorySegment allocate(clear_focus.Function fi, Arena arena) {
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

    private static final AddressLayout clear_focus$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("clear_focus"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * void (*clear_focus)(struct wlr_seat_keyboard_grab *)
     * }
     */
    public static final AddressLayout clear_focus$layout() {
        return clear_focus$LAYOUT;
    }

    private static final long clear_focus$OFFSET = 8;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * void (*clear_focus)(struct wlr_seat_keyboard_grab *)
     * }
     */
    public static final long clear_focus$offset() {
        return clear_focus$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * void (*clear_focus)(struct wlr_seat_keyboard_grab *)
     * }
     */
    public static MemorySegment clear_focus(MemorySegment struct) {
        return struct.get(clear_focus$LAYOUT, clear_focus$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * void (*clear_focus)(struct wlr_seat_keyboard_grab *)
     * }
     */
    public static void clear_focus(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(clear_focus$LAYOUT, clear_focus$OFFSET, fieldValue);
    }

    /**
     * {@snippet lang=c :
     * void (*key)(struct wlr_seat_keyboard_grab *, uint32_t, uint32_t, uint32_t)
     * }
     */
    public static class key {

        key() {
            // Should not be called directly
        }

        /**
         * The function pointer signature, expressed as a functional interface
         */
        public interface Function {
            void apply(MemorySegment _x0, int _x1, int _x2, int _x3);
        }

        private static final FunctionDescriptor $DESC = FunctionDescriptor.ofVoid(
            C.C_POINTER,
            C.C_INT,
            C.C_INT,
            C.C_INT
        );

        /**
         * The descriptor of this function pointer
         */
        public static FunctionDescriptor descriptor() {
            return $DESC;
        }

        private static final MethodHandle UP$MH = C.upcallHandle(key.Function.class, "apply", $DESC);

        /**
         * Allocates a new upcall stub, whose implementation is defined by {@code fi}.
         * The lifetime of the returned segment is managed by {@code arena}
         */
        public static MemorySegment allocate(key.Function fi, Arena arena) {
            return Linker.nativeLinker().upcallStub(UP$MH.bindTo(fi), $DESC, arena);
        }

        private static final MethodHandle DOWN$MH = Linker.nativeLinker().downcallHandle($DESC);

        /**
         * Invoke the upcall stub {@code funcPtr}, with given parameters
         */
        public static void invoke(MemorySegment funcPtr,MemorySegment _x0, int _x1, int _x2, int _x3) {
            try {
                 DOWN$MH.invokeExact(funcPtr, _x0, _x1, _x2, _x3);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        }
    }

    private static final AddressLayout key$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("key"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * void (*key)(struct wlr_seat_keyboard_grab *, uint32_t, uint32_t, uint32_t)
     * }
     */
    public static final AddressLayout key$layout() {
        return key$LAYOUT;
    }

    private static final long key$OFFSET = 16;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * void (*key)(struct wlr_seat_keyboard_grab *, uint32_t, uint32_t, uint32_t)
     * }
     */
    public static final long key$offset() {
        return key$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * void (*key)(struct wlr_seat_keyboard_grab *, uint32_t, uint32_t, uint32_t)
     * }
     */
    public static MemorySegment key(MemorySegment struct) {
        return struct.get(key$LAYOUT, key$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * void (*key)(struct wlr_seat_keyboard_grab *, uint32_t, uint32_t, uint32_t)
     * }
     */
    public static void key(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(key$LAYOUT, key$OFFSET, fieldValue);
    }

    /**
     * {@snippet lang=c :
     * void (*modifiers)(struct wlr_seat_keyboard_grab *, const struct wlr_keyboard_modifiers *)
     * }
     */
    public static class modifiers {

        modifiers() {
            // Should not be called directly
        }

        /**
         * The function pointer signature, expressed as a functional interface
         */
        public interface Function {
            void apply(MemorySegment _x0, MemorySegment _x1);
        }

        private static final FunctionDescriptor $DESC = FunctionDescriptor.ofVoid(
            C.C_POINTER,
            C.C_POINTER
        );

        /**
         * The descriptor of this function pointer
         */
        public static FunctionDescriptor descriptor() {
            return $DESC;
        }

        private static final MethodHandle UP$MH = C.upcallHandle(modifiers.Function.class, "apply", $DESC);

        /**
         * Allocates a new upcall stub, whose implementation is defined by {@code fi}.
         * The lifetime of the returned segment is managed by {@code arena}
         */
        public static MemorySegment allocate(modifiers.Function fi, Arena arena) {
            return Linker.nativeLinker().upcallStub(UP$MH.bindTo(fi), $DESC, arena);
        }

        private static final MethodHandle DOWN$MH = Linker.nativeLinker().downcallHandle($DESC);

        /**
         * Invoke the upcall stub {@code funcPtr}, with given parameters
         */
        public static void invoke(MemorySegment funcPtr,MemorySegment _x0, MemorySegment _x1) {
            try {
                 DOWN$MH.invokeExact(funcPtr, _x0, _x1);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        }
    }

    private static final AddressLayout modifiers$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("modifiers"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * void (*modifiers)(struct wlr_seat_keyboard_grab *, const struct wlr_keyboard_modifiers *)
     * }
     */
    public static final AddressLayout modifiers$layout() {
        return modifiers$LAYOUT;
    }

    private static final long modifiers$OFFSET = 24;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * void (*modifiers)(struct wlr_seat_keyboard_grab *, const struct wlr_keyboard_modifiers *)
     * }
     */
    public static final long modifiers$offset() {
        return modifiers$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * void (*modifiers)(struct wlr_seat_keyboard_grab *, const struct wlr_keyboard_modifiers *)
     * }
     */
    public static MemorySegment modifiers(MemorySegment struct) {
        return struct.get(modifiers$LAYOUT, modifiers$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * void (*modifiers)(struct wlr_seat_keyboard_grab *, const struct wlr_keyboard_modifiers *)
     * }
     */
    public static void modifiers(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(modifiers$LAYOUT, modifiers$OFFSET, fieldValue);
    }

    /**
     * {@snippet lang=c :
     * void (*cancel)(struct wlr_seat_keyboard_grab *)
     * }
     */
    public static class cancel {

        cancel() {
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

        private static final MethodHandle UP$MH = C.upcallHandle(cancel.Function.class, "apply", $DESC);

        /**
         * Allocates a new upcall stub, whose implementation is defined by {@code fi}.
         * The lifetime of the returned segment is managed by {@code arena}
         */
        public static MemorySegment allocate(cancel.Function fi, Arena arena) {
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

    private static final AddressLayout cancel$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("cancel"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * void (*cancel)(struct wlr_seat_keyboard_grab *)
     * }
     */
    public static final AddressLayout cancel$layout() {
        return cancel$LAYOUT;
    }

    private static final long cancel$OFFSET = 32;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * void (*cancel)(struct wlr_seat_keyboard_grab *)
     * }
     */
    public static final long cancel$offset() {
        return cancel$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * void (*cancel)(struct wlr_seat_keyboard_grab *)
     * }
     */
    public static MemorySegment cancel(MemorySegment struct) {
        return struct.get(cancel$LAYOUT, cancel$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * void (*cancel)(struct wlr_seat_keyboard_grab *)
     * }
     */
    public static void cancel(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(cancel$LAYOUT, cancel$OFFSET, fieldValue);
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
