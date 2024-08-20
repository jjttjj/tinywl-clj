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
 * struct wl_shell_surface_interface {
 *     void (*pong)(struct wl_client *, struct wl_resource *, uint32_t);
 *     void (*move)(struct wl_client *, struct wl_resource *, struct wl_resource *, uint32_t);
 *     void (*resize)(struct wl_client *, struct wl_resource *, struct wl_resource *, uint32_t, uint32_t);
 *     void (*set_toplevel)(struct wl_client *, struct wl_resource *);
 *     void (*set_transient)(struct wl_client *, struct wl_resource *, struct wl_resource *, int32_t, int32_t, uint32_t);
 *     void (*set_fullscreen)(struct wl_client *, struct wl_resource *, uint32_t, uint32_t, struct wl_resource *);
 *     void (*set_popup)(struct wl_client *, struct wl_resource *, struct wl_resource *, uint32_t, struct wl_resource *, int32_t, int32_t, uint32_t);
 *     void (*set_maximized)(struct wl_client *, struct wl_resource *, struct wl_resource *);
 *     void (*set_title)(struct wl_client *, struct wl_resource *, const char *);
 *     void (*set_class)(struct wl_client *, struct wl_resource *, const char *);
 * }
 * }
 */
public class wl_shell_surface_interface {

    wl_shell_surface_interface() {
        // Should not be called directly
    }

    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
        C.C_POINTER.withName("pong"),
        C.C_POINTER.withName("move"),
        C.C_POINTER.withName("resize"),
        C.C_POINTER.withName("set_toplevel"),
        C.C_POINTER.withName("set_transient"),
        C.C_POINTER.withName("set_fullscreen"),
        C.C_POINTER.withName("set_popup"),
        C.C_POINTER.withName("set_maximized"),
        C.C_POINTER.withName("set_title"),
        C.C_POINTER.withName("set_class")
    ).withName("wl_shell_surface_interface");

    /**
     * The layout of this struct
     */
    public static final GroupLayout layout() {
        return $LAYOUT;
    }

    /**
     * {@snippet lang=c :
     * void (*pong)(struct wl_client *, struct wl_resource *, uint32_t)
     * }
     */
    public static class pong {

        pong() {
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

        private static final MethodHandle UP$MH = C.upcallHandle(pong.Function.class, "apply", $DESC);

        /**
         * Allocates a new upcall stub, whose implementation is defined by {@code fi}.
         * The lifetime of the returned segment is managed by {@code arena}
         */
        public static MemorySegment allocate(pong.Function fi, Arena arena) {
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

    private static final AddressLayout pong$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("pong"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * void (*pong)(struct wl_client *, struct wl_resource *, uint32_t)
     * }
     */
    public static final AddressLayout pong$layout() {
        return pong$LAYOUT;
    }

    private static final long pong$OFFSET = 0;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * void (*pong)(struct wl_client *, struct wl_resource *, uint32_t)
     * }
     */
    public static final long pong$offset() {
        return pong$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * void (*pong)(struct wl_client *, struct wl_resource *, uint32_t)
     * }
     */
    public static MemorySegment pong(MemorySegment struct) {
        return struct.get(pong$LAYOUT, pong$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * void (*pong)(struct wl_client *, struct wl_resource *, uint32_t)
     * }
     */
    public static void pong(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(pong$LAYOUT, pong$OFFSET, fieldValue);
    }

    /**
     * {@snippet lang=c :
     * void (*move)(struct wl_client *, struct wl_resource *, struct wl_resource *, uint32_t)
     * }
     */
    public static class move {

        move() {
            // Should not be called directly
        }

        /**
         * The function pointer signature, expressed as a functional interface
         */
        public interface Function {
            void apply(MemorySegment _x0, MemorySegment _x1, MemorySegment _x2, int _x3);
        }

        private static final FunctionDescriptor $DESC = FunctionDescriptor.ofVoid(
            C.C_POINTER,
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

        private static final MethodHandle UP$MH = C.upcallHandle(move.Function.class, "apply", $DESC);

        /**
         * Allocates a new upcall stub, whose implementation is defined by {@code fi}.
         * The lifetime of the returned segment is managed by {@code arena}
         */
        public static MemorySegment allocate(move.Function fi, Arena arena) {
            return Linker.nativeLinker().upcallStub(UP$MH.bindTo(fi), $DESC, arena);
        }

        private static final MethodHandle DOWN$MH = Linker.nativeLinker().downcallHandle($DESC);

        /**
         * Invoke the upcall stub {@code funcPtr}, with given parameters
         */
        public static void invoke(MemorySegment funcPtr,MemorySegment _x0, MemorySegment _x1, MemorySegment _x2, int _x3) {
            try {
                 DOWN$MH.invokeExact(funcPtr, _x0, _x1, _x2, _x3);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        }
    }

    private static final AddressLayout move$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("move"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * void (*move)(struct wl_client *, struct wl_resource *, struct wl_resource *, uint32_t)
     * }
     */
    public static final AddressLayout move$layout() {
        return move$LAYOUT;
    }

    private static final long move$OFFSET = 8;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * void (*move)(struct wl_client *, struct wl_resource *, struct wl_resource *, uint32_t)
     * }
     */
    public static final long move$offset() {
        return move$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * void (*move)(struct wl_client *, struct wl_resource *, struct wl_resource *, uint32_t)
     * }
     */
    public static MemorySegment move(MemorySegment struct) {
        return struct.get(move$LAYOUT, move$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * void (*move)(struct wl_client *, struct wl_resource *, struct wl_resource *, uint32_t)
     * }
     */
    public static void move(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(move$LAYOUT, move$OFFSET, fieldValue);
    }

    /**
     * {@snippet lang=c :
     * void (*resize)(struct wl_client *, struct wl_resource *, struct wl_resource *, uint32_t, uint32_t)
     * }
     */
    public static class resize {

        resize() {
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

        private static final MethodHandle UP$MH = C.upcallHandle(resize.Function.class, "apply", $DESC);

        /**
         * Allocates a new upcall stub, whose implementation is defined by {@code fi}.
         * The lifetime of the returned segment is managed by {@code arena}
         */
        public static MemorySegment allocate(resize.Function fi, Arena arena) {
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

    private static final AddressLayout resize$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("resize"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * void (*resize)(struct wl_client *, struct wl_resource *, struct wl_resource *, uint32_t, uint32_t)
     * }
     */
    public static final AddressLayout resize$layout() {
        return resize$LAYOUT;
    }

    private static final long resize$OFFSET = 16;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * void (*resize)(struct wl_client *, struct wl_resource *, struct wl_resource *, uint32_t, uint32_t)
     * }
     */
    public static final long resize$offset() {
        return resize$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * void (*resize)(struct wl_client *, struct wl_resource *, struct wl_resource *, uint32_t, uint32_t)
     * }
     */
    public static MemorySegment resize(MemorySegment struct) {
        return struct.get(resize$LAYOUT, resize$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * void (*resize)(struct wl_client *, struct wl_resource *, struct wl_resource *, uint32_t, uint32_t)
     * }
     */
    public static void resize(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(resize$LAYOUT, resize$OFFSET, fieldValue);
    }

    /**
     * {@snippet lang=c :
     * void (*set_toplevel)(struct wl_client *, struct wl_resource *)
     * }
     */
    public static class set_toplevel {

        set_toplevel() {
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

        private static final MethodHandle UP$MH = C.upcallHandle(set_toplevel.Function.class, "apply", $DESC);

        /**
         * Allocates a new upcall stub, whose implementation is defined by {@code fi}.
         * The lifetime of the returned segment is managed by {@code arena}
         */
        public static MemorySegment allocate(set_toplevel.Function fi, Arena arena) {
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

    private static final AddressLayout set_toplevel$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("set_toplevel"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * void (*set_toplevel)(struct wl_client *, struct wl_resource *)
     * }
     */
    public static final AddressLayout set_toplevel$layout() {
        return set_toplevel$LAYOUT;
    }

    private static final long set_toplevel$OFFSET = 24;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * void (*set_toplevel)(struct wl_client *, struct wl_resource *)
     * }
     */
    public static final long set_toplevel$offset() {
        return set_toplevel$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * void (*set_toplevel)(struct wl_client *, struct wl_resource *)
     * }
     */
    public static MemorySegment set_toplevel(MemorySegment struct) {
        return struct.get(set_toplevel$LAYOUT, set_toplevel$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * void (*set_toplevel)(struct wl_client *, struct wl_resource *)
     * }
     */
    public static void set_toplevel(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(set_toplevel$LAYOUT, set_toplevel$OFFSET, fieldValue);
    }

    /**
     * {@snippet lang=c :
     * void (*set_transient)(struct wl_client *, struct wl_resource *, struct wl_resource *, int32_t, int32_t, uint32_t)
     * }
     */
    public static class set_transient {

        set_transient() {
            // Should not be called directly
        }

        /**
         * The function pointer signature, expressed as a functional interface
         */
        public interface Function {
            void apply(MemorySegment _x0, MemorySegment _x1, MemorySegment _x2, int _x3, int _x4, int _x5);
        }

        private static final FunctionDescriptor $DESC = FunctionDescriptor.ofVoid(
            C.C_POINTER,
            C.C_POINTER,
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

        private static final MethodHandle UP$MH = C.upcallHandle(set_transient.Function.class, "apply", $DESC);

        /**
         * Allocates a new upcall stub, whose implementation is defined by {@code fi}.
         * The lifetime of the returned segment is managed by {@code arena}
         */
        public static MemorySegment allocate(set_transient.Function fi, Arena arena) {
            return Linker.nativeLinker().upcallStub(UP$MH.bindTo(fi), $DESC, arena);
        }

        private static final MethodHandle DOWN$MH = Linker.nativeLinker().downcallHandle($DESC);

        /**
         * Invoke the upcall stub {@code funcPtr}, with given parameters
         */
        public static void invoke(MemorySegment funcPtr,MemorySegment _x0, MemorySegment _x1, MemorySegment _x2, int _x3, int _x4, int _x5) {
            try {
                 DOWN$MH.invokeExact(funcPtr, _x0, _x1, _x2, _x3, _x4, _x5);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        }
    }

    private static final AddressLayout set_transient$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("set_transient"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * void (*set_transient)(struct wl_client *, struct wl_resource *, struct wl_resource *, int32_t, int32_t, uint32_t)
     * }
     */
    public static final AddressLayout set_transient$layout() {
        return set_transient$LAYOUT;
    }

    private static final long set_transient$OFFSET = 32;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * void (*set_transient)(struct wl_client *, struct wl_resource *, struct wl_resource *, int32_t, int32_t, uint32_t)
     * }
     */
    public static final long set_transient$offset() {
        return set_transient$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * void (*set_transient)(struct wl_client *, struct wl_resource *, struct wl_resource *, int32_t, int32_t, uint32_t)
     * }
     */
    public static MemorySegment set_transient(MemorySegment struct) {
        return struct.get(set_transient$LAYOUT, set_transient$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * void (*set_transient)(struct wl_client *, struct wl_resource *, struct wl_resource *, int32_t, int32_t, uint32_t)
     * }
     */
    public static void set_transient(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(set_transient$LAYOUT, set_transient$OFFSET, fieldValue);
    }

    /**
     * {@snippet lang=c :
     * void (*set_fullscreen)(struct wl_client *, struct wl_resource *, uint32_t, uint32_t, struct wl_resource *)
     * }
     */
    public static class set_fullscreen {

        set_fullscreen() {
            // Should not be called directly
        }

        /**
         * The function pointer signature, expressed as a functional interface
         */
        public interface Function {
            void apply(MemorySegment _x0, MemorySegment _x1, int _x2, int _x3, MemorySegment _x4);
        }

        private static final FunctionDescriptor $DESC = FunctionDescriptor.ofVoid(
            C.C_POINTER,
            C.C_POINTER,
            C.C_INT,
            C.C_INT,
            C.C_POINTER
        );

        /**
         * The descriptor of this function pointer
         */
        public static FunctionDescriptor descriptor() {
            return $DESC;
        }

        private static final MethodHandle UP$MH = C.upcallHandle(set_fullscreen.Function.class, "apply", $DESC);

        /**
         * Allocates a new upcall stub, whose implementation is defined by {@code fi}.
         * The lifetime of the returned segment is managed by {@code arena}
         */
        public static MemorySegment allocate(set_fullscreen.Function fi, Arena arena) {
            return Linker.nativeLinker().upcallStub(UP$MH.bindTo(fi), $DESC, arena);
        }

        private static final MethodHandle DOWN$MH = Linker.nativeLinker().downcallHandle($DESC);

        /**
         * Invoke the upcall stub {@code funcPtr}, with given parameters
         */
        public static void invoke(MemorySegment funcPtr,MemorySegment _x0, MemorySegment _x1, int _x2, int _x3, MemorySegment _x4) {
            try {
                 DOWN$MH.invokeExact(funcPtr, _x0, _x1, _x2, _x3, _x4);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        }
    }

    private static final AddressLayout set_fullscreen$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("set_fullscreen"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * void (*set_fullscreen)(struct wl_client *, struct wl_resource *, uint32_t, uint32_t, struct wl_resource *)
     * }
     */
    public static final AddressLayout set_fullscreen$layout() {
        return set_fullscreen$LAYOUT;
    }

    private static final long set_fullscreen$OFFSET = 40;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * void (*set_fullscreen)(struct wl_client *, struct wl_resource *, uint32_t, uint32_t, struct wl_resource *)
     * }
     */
    public static final long set_fullscreen$offset() {
        return set_fullscreen$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * void (*set_fullscreen)(struct wl_client *, struct wl_resource *, uint32_t, uint32_t, struct wl_resource *)
     * }
     */
    public static MemorySegment set_fullscreen(MemorySegment struct) {
        return struct.get(set_fullscreen$LAYOUT, set_fullscreen$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * void (*set_fullscreen)(struct wl_client *, struct wl_resource *, uint32_t, uint32_t, struct wl_resource *)
     * }
     */
    public static void set_fullscreen(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(set_fullscreen$LAYOUT, set_fullscreen$OFFSET, fieldValue);
    }

    /**
     * {@snippet lang=c :
     * void (*set_popup)(struct wl_client *, struct wl_resource *, struct wl_resource *, uint32_t, struct wl_resource *, int32_t, int32_t, uint32_t)
     * }
     */
    public static class set_popup {

        set_popup() {
            // Should not be called directly
        }

        /**
         * The function pointer signature, expressed as a functional interface
         */
        public interface Function {
            void apply(MemorySegment _x0, MemorySegment _x1, MemorySegment _x2, int _x3, MemorySegment _x4, int _x5, int _x6, int _x7);
        }

        private static final FunctionDescriptor $DESC = FunctionDescriptor.ofVoid(
            C.C_POINTER,
            C.C_POINTER,
            C.C_POINTER,
            C.C_INT,
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

        private static final MethodHandle UP$MH = C.upcallHandle(set_popup.Function.class, "apply", $DESC);

        /**
         * Allocates a new upcall stub, whose implementation is defined by {@code fi}.
         * The lifetime of the returned segment is managed by {@code arena}
         */
        public static MemorySegment allocate(set_popup.Function fi, Arena arena) {
            return Linker.nativeLinker().upcallStub(UP$MH.bindTo(fi), $DESC, arena);
        }

        private static final MethodHandle DOWN$MH = Linker.nativeLinker().downcallHandle($DESC);

        /**
         * Invoke the upcall stub {@code funcPtr}, with given parameters
         */
        public static void invoke(MemorySegment funcPtr,MemorySegment _x0, MemorySegment _x1, MemorySegment _x2, int _x3, MemorySegment _x4, int _x5, int _x6, int _x7) {
            try {
                 DOWN$MH.invokeExact(funcPtr, _x0, _x1, _x2, _x3, _x4, _x5, _x6, _x7);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        }
    }

    private static final AddressLayout set_popup$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("set_popup"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * void (*set_popup)(struct wl_client *, struct wl_resource *, struct wl_resource *, uint32_t, struct wl_resource *, int32_t, int32_t, uint32_t)
     * }
     */
    public static final AddressLayout set_popup$layout() {
        return set_popup$LAYOUT;
    }

    private static final long set_popup$OFFSET = 48;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * void (*set_popup)(struct wl_client *, struct wl_resource *, struct wl_resource *, uint32_t, struct wl_resource *, int32_t, int32_t, uint32_t)
     * }
     */
    public static final long set_popup$offset() {
        return set_popup$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * void (*set_popup)(struct wl_client *, struct wl_resource *, struct wl_resource *, uint32_t, struct wl_resource *, int32_t, int32_t, uint32_t)
     * }
     */
    public static MemorySegment set_popup(MemorySegment struct) {
        return struct.get(set_popup$LAYOUT, set_popup$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * void (*set_popup)(struct wl_client *, struct wl_resource *, struct wl_resource *, uint32_t, struct wl_resource *, int32_t, int32_t, uint32_t)
     * }
     */
    public static void set_popup(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(set_popup$LAYOUT, set_popup$OFFSET, fieldValue);
    }

    /**
     * {@snippet lang=c :
     * void (*set_maximized)(struct wl_client *, struct wl_resource *, struct wl_resource *)
     * }
     */
    public static class set_maximized {

        set_maximized() {
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

        private static final MethodHandle UP$MH = C.upcallHandle(set_maximized.Function.class, "apply", $DESC);

        /**
         * Allocates a new upcall stub, whose implementation is defined by {@code fi}.
         * The lifetime of the returned segment is managed by {@code arena}
         */
        public static MemorySegment allocate(set_maximized.Function fi, Arena arena) {
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

    private static final AddressLayout set_maximized$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("set_maximized"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * void (*set_maximized)(struct wl_client *, struct wl_resource *, struct wl_resource *)
     * }
     */
    public static final AddressLayout set_maximized$layout() {
        return set_maximized$LAYOUT;
    }

    private static final long set_maximized$OFFSET = 56;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * void (*set_maximized)(struct wl_client *, struct wl_resource *, struct wl_resource *)
     * }
     */
    public static final long set_maximized$offset() {
        return set_maximized$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * void (*set_maximized)(struct wl_client *, struct wl_resource *, struct wl_resource *)
     * }
     */
    public static MemorySegment set_maximized(MemorySegment struct) {
        return struct.get(set_maximized$LAYOUT, set_maximized$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * void (*set_maximized)(struct wl_client *, struct wl_resource *, struct wl_resource *)
     * }
     */
    public static void set_maximized(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(set_maximized$LAYOUT, set_maximized$OFFSET, fieldValue);
    }

    /**
     * {@snippet lang=c :
     * void (*set_title)(struct wl_client *, struct wl_resource *, const char *)
     * }
     */
    public static class set_title {

        set_title() {
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

        private static final MethodHandle UP$MH = C.upcallHandle(set_title.Function.class, "apply", $DESC);

        /**
         * Allocates a new upcall stub, whose implementation is defined by {@code fi}.
         * The lifetime of the returned segment is managed by {@code arena}
         */
        public static MemorySegment allocate(set_title.Function fi, Arena arena) {
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

    private static final AddressLayout set_title$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("set_title"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * void (*set_title)(struct wl_client *, struct wl_resource *, const char *)
     * }
     */
    public static final AddressLayout set_title$layout() {
        return set_title$LAYOUT;
    }

    private static final long set_title$OFFSET = 64;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * void (*set_title)(struct wl_client *, struct wl_resource *, const char *)
     * }
     */
    public static final long set_title$offset() {
        return set_title$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * void (*set_title)(struct wl_client *, struct wl_resource *, const char *)
     * }
     */
    public static MemorySegment set_title(MemorySegment struct) {
        return struct.get(set_title$LAYOUT, set_title$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * void (*set_title)(struct wl_client *, struct wl_resource *, const char *)
     * }
     */
    public static void set_title(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(set_title$LAYOUT, set_title$OFFSET, fieldValue);
    }

    /**
     * {@snippet lang=c :
     * void (*set_class)(struct wl_client *, struct wl_resource *, const char *)
     * }
     */
    public static class set_class {

        set_class() {
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

        private static final MethodHandle UP$MH = C.upcallHandle(set_class.Function.class, "apply", $DESC);

        /**
         * Allocates a new upcall stub, whose implementation is defined by {@code fi}.
         * The lifetime of the returned segment is managed by {@code arena}
         */
        public static MemorySegment allocate(set_class.Function fi, Arena arena) {
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

    private static final AddressLayout set_class$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("set_class"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * void (*set_class)(struct wl_client *, struct wl_resource *, const char *)
     * }
     */
    public static final AddressLayout set_class$layout() {
        return set_class$LAYOUT;
    }

    private static final long set_class$OFFSET = 72;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * void (*set_class)(struct wl_client *, struct wl_resource *, const char *)
     * }
     */
    public static final long set_class$offset() {
        return set_class$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * void (*set_class)(struct wl_client *, struct wl_resource *, const char *)
     * }
     */
    public static MemorySegment set_class(MemorySegment struct) {
        return struct.get(set_class$LAYOUT, set_class$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * void (*set_class)(struct wl_client *, struct wl_resource *, const char *)
     * }
     */
    public static void set_class(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(set_class$LAYOUT, set_class$OFFSET, fieldValue);
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
