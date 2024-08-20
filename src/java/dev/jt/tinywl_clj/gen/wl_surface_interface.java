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
 * struct wl_surface_interface {
 *     void (*destroy)(struct wl_client *, struct wl_resource *);
 *     void (*attach)(struct wl_client *, struct wl_resource *, struct wl_resource *, int32_t, int32_t);
 *     void (*damage)(struct wl_client *, struct wl_resource *, int32_t, int32_t, int32_t, int32_t);
 *     void (*frame)(struct wl_client *, struct wl_resource *, uint32_t);
 *     void (*set_opaque_region)(struct wl_client *, struct wl_resource *, struct wl_resource *);
 *     void (*set_input_region)(struct wl_client *, struct wl_resource *, struct wl_resource *);
 *     void (*commit)(struct wl_client *, struct wl_resource *);
 *     void (*set_buffer_transform)(struct wl_client *, struct wl_resource *, int32_t);
 *     void (*set_buffer_scale)(struct wl_client *, struct wl_resource *, int32_t);
 *     void (*damage_buffer)(struct wl_client *, struct wl_resource *, int32_t, int32_t, int32_t, int32_t);
 *     void (*offset)(struct wl_client *, struct wl_resource *, int32_t, int32_t);
 * }
 * }
 */
public class wl_surface_interface {

    wl_surface_interface() {
        // Should not be called directly
    }

    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
        C.C_POINTER.withName("destroy"),
        C.C_POINTER.withName("attach"),
        C.C_POINTER.withName("damage"),
        C.C_POINTER.withName("frame"),
        C.C_POINTER.withName("set_opaque_region"),
        C.C_POINTER.withName("set_input_region"),
        C.C_POINTER.withName("commit"),
        C.C_POINTER.withName("set_buffer_transform"),
        C.C_POINTER.withName("set_buffer_scale"),
        C.C_POINTER.withName("damage_buffer"),
        C.C_POINTER.withName("offset")
    ).withName("wl_surface_interface");

    /**
     * The layout of this struct
     */
    public static final GroupLayout layout() {
        return $LAYOUT;
    }

    /**
     * {@snippet lang=c :
     * void (*destroy)(struct wl_client *, struct wl_resource *)
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
        public static void invoke(MemorySegment funcPtr,MemorySegment _x0, MemorySegment _x1) {
            try {
                 DOWN$MH.invokeExact(funcPtr, _x0, _x1);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        }
    }

    private static final AddressLayout destroy$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("destroy"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * void (*destroy)(struct wl_client *, struct wl_resource *)
     * }
     */
    public static final AddressLayout destroy$layout() {
        return destroy$LAYOUT;
    }

    private static final long destroy$OFFSET = 0;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * void (*destroy)(struct wl_client *, struct wl_resource *)
     * }
     */
    public static final long destroy$offset() {
        return destroy$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * void (*destroy)(struct wl_client *, struct wl_resource *)
     * }
     */
    public static MemorySegment destroy(MemorySegment struct) {
        return struct.get(destroy$LAYOUT, destroy$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * void (*destroy)(struct wl_client *, struct wl_resource *)
     * }
     */
    public static void destroy(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(destroy$LAYOUT, destroy$OFFSET, fieldValue);
    }

    /**
     * {@snippet lang=c :
     * void (*attach)(struct wl_client *, struct wl_resource *, struct wl_resource *, int32_t, int32_t)
     * }
     */
    public static class attach {

        attach() {
            // Should not be called directly
        }

        /**
         * The function pointer signature, expressed as a functional interface
         */
        public interface Function {
            void apply(MemorySegment _x0, MemorySegment _x1, MemorySegment _x2, int _x3, int _x4);
        }

        private static final FunctionDescriptor $DESC = FunctionDescriptor.ofVoid(
            C.C_POINTER,
            C.C_POINTER,
            C.C_POINTER,
            C.C_INT,
            C.C_INT
        );

        /**
         * The descriptor of this function pointer
         */
        public static FunctionDescriptor descriptor() {
            return $DESC;
        }

        private static final MethodHandle UP$MH = C.upcallHandle(attach.Function.class, "apply", $DESC);

        /**
         * Allocates a new upcall stub, whose implementation is defined by {@code fi}.
         * The lifetime of the returned segment is managed by {@code arena}
         */
        public static MemorySegment allocate(attach.Function fi, Arena arena) {
            return Linker.nativeLinker().upcallStub(UP$MH.bindTo(fi), $DESC, arena);
        }

        private static final MethodHandle DOWN$MH = Linker.nativeLinker().downcallHandle($DESC);

        /**
         * Invoke the upcall stub {@code funcPtr}, with given parameters
         */
        public static void invoke(MemorySegment funcPtr,MemorySegment _x0, MemorySegment _x1, MemorySegment _x2, int _x3, int _x4) {
            try {
                 DOWN$MH.invokeExact(funcPtr, _x0, _x1, _x2, _x3, _x4);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        }
    }

    private static final AddressLayout attach$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("attach"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * void (*attach)(struct wl_client *, struct wl_resource *, struct wl_resource *, int32_t, int32_t)
     * }
     */
    public static final AddressLayout attach$layout() {
        return attach$LAYOUT;
    }

    private static final long attach$OFFSET = 8;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * void (*attach)(struct wl_client *, struct wl_resource *, struct wl_resource *, int32_t, int32_t)
     * }
     */
    public static final long attach$offset() {
        return attach$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * void (*attach)(struct wl_client *, struct wl_resource *, struct wl_resource *, int32_t, int32_t)
     * }
     */
    public static MemorySegment attach(MemorySegment struct) {
        return struct.get(attach$LAYOUT, attach$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * void (*attach)(struct wl_client *, struct wl_resource *, struct wl_resource *, int32_t, int32_t)
     * }
     */
    public static void attach(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(attach$LAYOUT, attach$OFFSET, fieldValue);
    }

    /**
     * {@snippet lang=c :
     * void (*damage)(struct wl_client *, struct wl_resource *, int32_t, int32_t, int32_t, int32_t)
     * }
     */
    public static class damage {

        damage() {
            // Should not be called directly
        }

        /**
         * The function pointer signature, expressed as a functional interface
         */
        public interface Function {
            void apply(MemorySegment _x0, MemorySegment _x1, int _x2, int _x3, int _x4, int _x5);
        }

        private static final FunctionDescriptor $DESC = FunctionDescriptor.ofVoid(
            C.C_POINTER,
            C.C_POINTER,
            C.C_INT,
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

        private static final MethodHandle UP$MH = C.upcallHandle(damage.Function.class, "apply", $DESC);

        /**
         * Allocates a new upcall stub, whose implementation is defined by {@code fi}.
         * The lifetime of the returned segment is managed by {@code arena}
         */
        public static MemorySegment allocate(damage.Function fi, Arena arena) {
            return Linker.nativeLinker().upcallStub(UP$MH.bindTo(fi), $DESC, arena);
        }

        private static final MethodHandle DOWN$MH = Linker.nativeLinker().downcallHandle($DESC);

        /**
         * Invoke the upcall stub {@code funcPtr}, with given parameters
         */
        public static void invoke(MemorySegment funcPtr,MemorySegment _x0, MemorySegment _x1, int _x2, int _x3, int _x4, int _x5) {
            try {
                 DOWN$MH.invokeExact(funcPtr, _x0, _x1, _x2, _x3, _x4, _x5);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        }
    }

    private static final AddressLayout damage$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("damage"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * void (*damage)(struct wl_client *, struct wl_resource *, int32_t, int32_t, int32_t, int32_t)
     * }
     */
    public static final AddressLayout damage$layout() {
        return damage$LAYOUT;
    }

    private static final long damage$OFFSET = 16;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * void (*damage)(struct wl_client *, struct wl_resource *, int32_t, int32_t, int32_t, int32_t)
     * }
     */
    public static final long damage$offset() {
        return damage$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * void (*damage)(struct wl_client *, struct wl_resource *, int32_t, int32_t, int32_t, int32_t)
     * }
     */
    public static MemorySegment damage(MemorySegment struct) {
        return struct.get(damage$LAYOUT, damage$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * void (*damage)(struct wl_client *, struct wl_resource *, int32_t, int32_t, int32_t, int32_t)
     * }
     */
    public static void damage(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(damage$LAYOUT, damage$OFFSET, fieldValue);
    }

    /**
     * {@snippet lang=c :
     * void (*frame)(struct wl_client *, struct wl_resource *, uint32_t)
     * }
     */
    public static class frame {

        frame() {
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

        private static final MethodHandle UP$MH = C.upcallHandle(frame.Function.class, "apply", $DESC);

        /**
         * Allocates a new upcall stub, whose implementation is defined by {@code fi}.
         * The lifetime of the returned segment is managed by {@code arena}
         */
        public static MemorySegment allocate(frame.Function fi, Arena arena) {
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

    private static final AddressLayout frame$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("frame"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * void (*frame)(struct wl_client *, struct wl_resource *, uint32_t)
     * }
     */
    public static final AddressLayout frame$layout() {
        return frame$LAYOUT;
    }

    private static final long frame$OFFSET = 24;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * void (*frame)(struct wl_client *, struct wl_resource *, uint32_t)
     * }
     */
    public static final long frame$offset() {
        return frame$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * void (*frame)(struct wl_client *, struct wl_resource *, uint32_t)
     * }
     */
    public static MemorySegment frame(MemorySegment struct) {
        return struct.get(frame$LAYOUT, frame$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * void (*frame)(struct wl_client *, struct wl_resource *, uint32_t)
     * }
     */
    public static void frame(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(frame$LAYOUT, frame$OFFSET, fieldValue);
    }

    /**
     * {@snippet lang=c :
     * void (*set_opaque_region)(struct wl_client *, struct wl_resource *, struct wl_resource *)
     * }
     */
    public static class set_opaque_region {

        set_opaque_region() {
            // Should not be called directly
        }

        /**
         * The function pointer signature, expressed as a functional interface
         */
        public interface Function {
            void apply(MemorySegment _x0, MemorySegment _x1, MemorySegment _x2);
        }

        private static final FunctionDescriptor $DESC = FunctionDescriptor.ofVoid(
            C.C_POINTER,
            C.C_POINTER,
            C.C_POINTER
        );

        /**
         * The descriptor of this function pointer
         */
        public static FunctionDescriptor descriptor() {
            return $DESC;
        }

        private static final MethodHandle UP$MH = C.upcallHandle(set_opaque_region.Function.class, "apply", $DESC);

        /**
         * Allocates a new upcall stub, whose implementation is defined by {@code fi}.
         * The lifetime of the returned segment is managed by {@code arena}
         */
        public static MemorySegment allocate(set_opaque_region.Function fi, Arena arena) {
            return Linker.nativeLinker().upcallStub(UP$MH.bindTo(fi), $DESC, arena);
        }

        private static final MethodHandle DOWN$MH = Linker.nativeLinker().downcallHandle($DESC);

        /**
         * Invoke the upcall stub {@code funcPtr}, with given parameters
         */
        public static void invoke(MemorySegment funcPtr,MemorySegment _x0, MemorySegment _x1, MemorySegment _x2) {
            try {
                 DOWN$MH.invokeExact(funcPtr, _x0, _x1, _x2);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        }
    }

    private static final AddressLayout set_opaque_region$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("set_opaque_region"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * void (*set_opaque_region)(struct wl_client *, struct wl_resource *, struct wl_resource *)
     * }
     */
    public static final AddressLayout set_opaque_region$layout() {
        return set_opaque_region$LAYOUT;
    }

    private static final long set_opaque_region$OFFSET = 32;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * void (*set_opaque_region)(struct wl_client *, struct wl_resource *, struct wl_resource *)
     * }
     */
    public static final long set_opaque_region$offset() {
        return set_opaque_region$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * void (*set_opaque_region)(struct wl_client *, struct wl_resource *, struct wl_resource *)
     * }
     */
    public static MemorySegment set_opaque_region(MemorySegment struct) {
        return struct.get(set_opaque_region$LAYOUT, set_opaque_region$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * void (*set_opaque_region)(struct wl_client *, struct wl_resource *, struct wl_resource *)
     * }
     */
    public static void set_opaque_region(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(set_opaque_region$LAYOUT, set_opaque_region$OFFSET, fieldValue);
    }

    /**
     * {@snippet lang=c :
     * void (*set_input_region)(struct wl_client *, struct wl_resource *, struct wl_resource *)
     * }
     */
    public static class set_input_region {

        set_input_region() {
            // Should not be called directly
        }

        /**
         * The function pointer signature, expressed as a functional interface
         */
        public interface Function {
            void apply(MemorySegment _x0, MemorySegment _x1, MemorySegment _x2);
        }

        private static final FunctionDescriptor $DESC = FunctionDescriptor.ofVoid(
            C.C_POINTER,
            C.C_POINTER,
            C.C_POINTER
        );

        /**
         * The descriptor of this function pointer
         */
        public static FunctionDescriptor descriptor() {
            return $DESC;
        }

        private static final MethodHandle UP$MH = C.upcallHandle(set_input_region.Function.class, "apply", $DESC);

        /**
         * Allocates a new upcall stub, whose implementation is defined by {@code fi}.
         * The lifetime of the returned segment is managed by {@code arena}
         */
        public static MemorySegment allocate(set_input_region.Function fi, Arena arena) {
            return Linker.nativeLinker().upcallStub(UP$MH.bindTo(fi), $DESC, arena);
        }

        private static final MethodHandle DOWN$MH = Linker.nativeLinker().downcallHandle($DESC);

        /**
         * Invoke the upcall stub {@code funcPtr}, with given parameters
         */
        public static void invoke(MemorySegment funcPtr,MemorySegment _x0, MemorySegment _x1, MemorySegment _x2) {
            try {
                 DOWN$MH.invokeExact(funcPtr, _x0, _x1, _x2);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        }
    }

    private static final AddressLayout set_input_region$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("set_input_region"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * void (*set_input_region)(struct wl_client *, struct wl_resource *, struct wl_resource *)
     * }
     */
    public static final AddressLayout set_input_region$layout() {
        return set_input_region$LAYOUT;
    }

    private static final long set_input_region$OFFSET = 40;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * void (*set_input_region)(struct wl_client *, struct wl_resource *, struct wl_resource *)
     * }
     */
    public static final long set_input_region$offset() {
        return set_input_region$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * void (*set_input_region)(struct wl_client *, struct wl_resource *, struct wl_resource *)
     * }
     */
    public static MemorySegment set_input_region(MemorySegment struct) {
        return struct.get(set_input_region$LAYOUT, set_input_region$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * void (*set_input_region)(struct wl_client *, struct wl_resource *, struct wl_resource *)
     * }
     */
    public static void set_input_region(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(set_input_region$LAYOUT, set_input_region$OFFSET, fieldValue);
    }

    /**
     * {@snippet lang=c :
     * void (*commit)(struct wl_client *, struct wl_resource *)
     * }
     */
    public static class commit {

        commit() {
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

        private static final MethodHandle UP$MH = C.upcallHandle(commit.Function.class, "apply", $DESC);

        /**
         * Allocates a new upcall stub, whose implementation is defined by {@code fi}.
         * The lifetime of the returned segment is managed by {@code arena}
         */
        public static MemorySegment allocate(commit.Function fi, Arena arena) {
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

    private static final AddressLayout commit$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("commit"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * void (*commit)(struct wl_client *, struct wl_resource *)
     * }
     */
    public static final AddressLayout commit$layout() {
        return commit$LAYOUT;
    }

    private static final long commit$OFFSET = 48;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * void (*commit)(struct wl_client *, struct wl_resource *)
     * }
     */
    public static final long commit$offset() {
        return commit$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * void (*commit)(struct wl_client *, struct wl_resource *)
     * }
     */
    public static MemorySegment commit(MemorySegment struct) {
        return struct.get(commit$LAYOUT, commit$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * void (*commit)(struct wl_client *, struct wl_resource *)
     * }
     */
    public static void commit(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(commit$LAYOUT, commit$OFFSET, fieldValue);
    }

    /**
     * {@snippet lang=c :
     * void (*set_buffer_transform)(struct wl_client *, struct wl_resource *, int32_t)
     * }
     */
    public static class set_buffer_transform {

        set_buffer_transform() {
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

        private static final MethodHandle UP$MH = C.upcallHandle(set_buffer_transform.Function.class, "apply", $DESC);

        /**
         * Allocates a new upcall stub, whose implementation is defined by {@code fi}.
         * The lifetime of the returned segment is managed by {@code arena}
         */
        public static MemorySegment allocate(set_buffer_transform.Function fi, Arena arena) {
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

    private static final AddressLayout set_buffer_transform$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("set_buffer_transform"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * void (*set_buffer_transform)(struct wl_client *, struct wl_resource *, int32_t)
     * }
     */
    public static final AddressLayout set_buffer_transform$layout() {
        return set_buffer_transform$LAYOUT;
    }

    private static final long set_buffer_transform$OFFSET = 56;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * void (*set_buffer_transform)(struct wl_client *, struct wl_resource *, int32_t)
     * }
     */
    public static final long set_buffer_transform$offset() {
        return set_buffer_transform$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * void (*set_buffer_transform)(struct wl_client *, struct wl_resource *, int32_t)
     * }
     */
    public static MemorySegment set_buffer_transform(MemorySegment struct) {
        return struct.get(set_buffer_transform$LAYOUT, set_buffer_transform$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * void (*set_buffer_transform)(struct wl_client *, struct wl_resource *, int32_t)
     * }
     */
    public static void set_buffer_transform(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(set_buffer_transform$LAYOUT, set_buffer_transform$OFFSET, fieldValue);
    }

    /**
     * {@snippet lang=c :
     * void (*set_buffer_scale)(struct wl_client *, struct wl_resource *, int32_t)
     * }
     */
    public static class set_buffer_scale {

        set_buffer_scale() {
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

        private static final MethodHandle UP$MH = C.upcallHandle(set_buffer_scale.Function.class, "apply", $DESC);

        /**
         * Allocates a new upcall stub, whose implementation is defined by {@code fi}.
         * The lifetime of the returned segment is managed by {@code arena}
         */
        public static MemorySegment allocate(set_buffer_scale.Function fi, Arena arena) {
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

    private static final AddressLayout set_buffer_scale$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("set_buffer_scale"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * void (*set_buffer_scale)(struct wl_client *, struct wl_resource *, int32_t)
     * }
     */
    public static final AddressLayout set_buffer_scale$layout() {
        return set_buffer_scale$LAYOUT;
    }

    private static final long set_buffer_scale$OFFSET = 64;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * void (*set_buffer_scale)(struct wl_client *, struct wl_resource *, int32_t)
     * }
     */
    public static final long set_buffer_scale$offset() {
        return set_buffer_scale$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * void (*set_buffer_scale)(struct wl_client *, struct wl_resource *, int32_t)
     * }
     */
    public static MemorySegment set_buffer_scale(MemorySegment struct) {
        return struct.get(set_buffer_scale$LAYOUT, set_buffer_scale$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * void (*set_buffer_scale)(struct wl_client *, struct wl_resource *, int32_t)
     * }
     */
    public static void set_buffer_scale(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(set_buffer_scale$LAYOUT, set_buffer_scale$OFFSET, fieldValue);
    }

    /**
     * {@snippet lang=c :
     * void (*damage_buffer)(struct wl_client *, struct wl_resource *, int32_t, int32_t, int32_t, int32_t)
     * }
     */
    public static class damage_buffer {

        damage_buffer() {
            // Should not be called directly
        }

        /**
         * The function pointer signature, expressed as a functional interface
         */
        public interface Function {
            void apply(MemorySegment _x0, MemorySegment _x1, int _x2, int _x3, int _x4, int _x5);
        }

        private static final FunctionDescriptor $DESC = FunctionDescriptor.ofVoid(
            C.C_POINTER,
            C.C_POINTER,
            C.C_INT,
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

        private static final MethodHandle UP$MH = C.upcallHandle(damage_buffer.Function.class, "apply", $DESC);

        /**
         * Allocates a new upcall stub, whose implementation is defined by {@code fi}.
         * The lifetime of the returned segment is managed by {@code arena}
         */
        public static MemorySegment allocate(damage_buffer.Function fi, Arena arena) {
            return Linker.nativeLinker().upcallStub(UP$MH.bindTo(fi), $DESC, arena);
        }

        private static final MethodHandle DOWN$MH = Linker.nativeLinker().downcallHandle($DESC);

        /**
         * Invoke the upcall stub {@code funcPtr}, with given parameters
         */
        public static void invoke(MemorySegment funcPtr,MemorySegment _x0, MemorySegment _x1, int _x2, int _x3, int _x4, int _x5) {
            try {
                 DOWN$MH.invokeExact(funcPtr, _x0, _x1, _x2, _x3, _x4, _x5);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        }
    }

    private static final AddressLayout damage_buffer$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("damage_buffer"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * void (*damage_buffer)(struct wl_client *, struct wl_resource *, int32_t, int32_t, int32_t, int32_t)
     * }
     */
    public static final AddressLayout damage_buffer$layout() {
        return damage_buffer$LAYOUT;
    }

    private static final long damage_buffer$OFFSET = 72;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * void (*damage_buffer)(struct wl_client *, struct wl_resource *, int32_t, int32_t, int32_t, int32_t)
     * }
     */
    public static final long damage_buffer$offset() {
        return damage_buffer$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * void (*damage_buffer)(struct wl_client *, struct wl_resource *, int32_t, int32_t, int32_t, int32_t)
     * }
     */
    public static MemorySegment damage_buffer(MemorySegment struct) {
        return struct.get(damage_buffer$LAYOUT, damage_buffer$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * void (*damage_buffer)(struct wl_client *, struct wl_resource *, int32_t, int32_t, int32_t, int32_t)
     * }
     */
    public static void damage_buffer(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(damage_buffer$LAYOUT, damage_buffer$OFFSET, fieldValue);
    }

    /**
     * {@snippet lang=c :
     * void (*offset)(struct wl_client *, struct wl_resource *, int32_t, int32_t)
     * }
     */
    public static class offset {

        offset() {
            // Should not be called directly
        }

        /**
         * The function pointer signature, expressed as a functional interface
         */
        public interface Function {
            void apply(MemorySegment _x0, MemorySegment _x1, int _x2, int _x3);
        }

        private static final FunctionDescriptor $DESC = FunctionDescriptor.ofVoid(
            C.C_POINTER,
            C.C_POINTER,
            C.C_INT,
            C.C_INT
        );

        /**
         * The descriptor of this function pointer
         */
        public static FunctionDescriptor descriptor() {
            return $DESC;
        }

        private static final MethodHandle UP$MH = C.upcallHandle(offset.Function.class, "apply", $DESC);

        /**
         * Allocates a new upcall stub, whose implementation is defined by {@code fi}.
         * The lifetime of the returned segment is managed by {@code arena}
         */
        public static MemorySegment allocate(offset.Function fi, Arena arena) {
            return Linker.nativeLinker().upcallStub(UP$MH.bindTo(fi), $DESC, arena);
        }

        private static final MethodHandle DOWN$MH = Linker.nativeLinker().downcallHandle($DESC);

        /**
         * Invoke the upcall stub {@code funcPtr}, with given parameters
         */
        public static void invoke(MemorySegment funcPtr,MemorySegment _x0, MemorySegment _x1, int _x2, int _x3) {
            try {
                 DOWN$MH.invokeExact(funcPtr, _x0, _x1, _x2, _x3);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        }
    }

    private static final AddressLayout offset$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("offset"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * void (*offset)(struct wl_client *, struct wl_resource *, int32_t, int32_t)
     * }
     */
    public static final AddressLayout offset$layout() {
        return offset$LAYOUT;
    }

    private static final long offset$OFFSET = 80;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * void (*offset)(struct wl_client *, struct wl_resource *, int32_t, int32_t)
     * }
     */
    public static final long offset$offset() {
        return offset$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * void (*offset)(struct wl_client *, struct wl_resource *, int32_t, int32_t)
     * }
     */
    public static MemorySegment offset(MemorySegment struct) {
        return struct.get(offset$LAYOUT, offset$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * void (*offset)(struct wl_client *, struct wl_resource *, int32_t, int32_t)
     * }
     */
    public static void offset(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(offset$LAYOUT, offset$OFFSET, fieldValue);
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
