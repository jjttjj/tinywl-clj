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
 * struct __locale_struct {
 *     struct __locale_data *__locales[13];
 *     const unsigned short *__ctype_b;
 *     const int *__ctype_tolower;
 *     const int *__ctype_toupper;
 *     const char *__names[13];
 * }
 * }
 */
public class __locale_struct {

    __locale_struct() {
        // Should not be called directly
    }

    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
        MemoryLayout.sequenceLayout(13, C.C_POINTER).withName("__locales"),
        C.C_POINTER.withName("__ctype_b"),
        C.C_POINTER.withName("__ctype_tolower"),
        C.C_POINTER.withName("__ctype_toupper"),
        MemoryLayout.sequenceLayout(13, C.C_POINTER).withName("__names")
    ).withName("__locale_struct");

    /**
     * The layout of this struct
     */
    public static final GroupLayout layout() {
        return $LAYOUT;
    }

    private static final SequenceLayout __locales$LAYOUT = (SequenceLayout)$LAYOUT.select(groupElement("__locales"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * struct __locale_data *__locales[13]
     * }
     */
    public static final SequenceLayout __locales$layout() {
        return __locales$LAYOUT;
    }

    private static final long __locales$OFFSET = 0;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * struct __locale_data *__locales[13]
     * }
     */
    public static final long __locales$offset() {
        return __locales$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * struct __locale_data *__locales[13]
     * }
     */
    public static MemorySegment __locales(MemorySegment struct) {
        return struct.asSlice(__locales$OFFSET, __locales$LAYOUT.byteSize());
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * struct __locale_data *__locales[13]
     * }
     */
    public static void __locales(MemorySegment struct, MemorySegment fieldValue) {
        MemorySegment.copy(fieldValue, 0L, struct, __locales$OFFSET, __locales$LAYOUT.byteSize());
    }

    private static long[] __locales$DIMS = { 13 };

    /**
     * Dimensions for array field:
     * {@snippet lang=c :
     * struct __locale_data *__locales[13]
     * }
     */
    public static long[] __locales$dimensions() {
        return __locales$DIMS;
    }
    private static final VarHandle __locales$ELEM_HANDLE = __locales$LAYOUT.varHandle(sequenceElement());

    /**
     * Indexed getter for field:
     * {@snippet lang=c :
     * struct __locale_data *__locales[13]
     * }
     */
    public static MemorySegment __locales(MemorySegment struct, long index0) {
        return (MemorySegment)__locales$ELEM_HANDLE.get(struct, 0L, index0);
    }

    /**
     * Indexed setter for field:
     * {@snippet lang=c :
     * struct __locale_data *__locales[13]
     * }
     */
    public static void __locales(MemorySegment struct, long index0, MemorySegment fieldValue) {
        __locales$ELEM_HANDLE.set(struct, 0L, index0, fieldValue);
    }

    private static final AddressLayout __ctype_b$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("__ctype_b"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * const unsigned short *__ctype_b
     * }
     */
    public static final AddressLayout __ctype_b$layout() {
        return __ctype_b$LAYOUT;
    }

    private static final long __ctype_b$OFFSET = 104;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * const unsigned short *__ctype_b
     * }
     */
    public static final long __ctype_b$offset() {
        return __ctype_b$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * const unsigned short *__ctype_b
     * }
     */
    public static MemorySegment __ctype_b(MemorySegment struct) {
        return struct.get(__ctype_b$LAYOUT, __ctype_b$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * const unsigned short *__ctype_b
     * }
     */
    public static void __ctype_b(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(__ctype_b$LAYOUT, __ctype_b$OFFSET, fieldValue);
    }

    private static final AddressLayout __ctype_tolower$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("__ctype_tolower"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * const int *__ctype_tolower
     * }
     */
    public static final AddressLayout __ctype_tolower$layout() {
        return __ctype_tolower$LAYOUT;
    }

    private static final long __ctype_tolower$OFFSET = 112;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * const int *__ctype_tolower
     * }
     */
    public static final long __ctype_tolower$offset() {
        return __ctype_tolower$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * const int *__ctype_tolower
     * }
     */
    public static MemorySegment __ctype_tolower(MemorySegment struct) {
        return struct.get(__ctype_tolower$LAYOUT, __ctype_tolower$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * const int *__ctype_tolower
     * }
     */
    public static void __ctype_tolower(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(__ctype_tolower$LAYOUT, __ctype_tolower$OFFSET, fieldValue);
    }

    private static final AddressLayout __ctype_toupper$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("__ctype_toupper"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * const int *__ctype_toupper
     * }
     */
    public static final AddressLayout __ctype_toupper$layout() {
        return __ctype_toupper$LAYOUT;
    }

    private static final long __ctype_toupper$OFFSET = 120;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * const int *__ctype_toupper
     * }
     */
    public static final long __ctype_toupper$offset() {
        return __ctype_toupper$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * const int *__ctype_toupper
     * }
     */
    public static MemorySegment __ctype_toupper(MemorySegment struct) {
        return struct.get(__ctype_toupper$LAYOUT, __ctype_toupper$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * const int *__ctype_toupper
     * }
     */
    public static void __ctype_toupper(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(__ctype_toupper$LAYOUT, __ctype_toupper$OFFSET, fieldValue);
    }

    private static final SequenceLayout __names$LAYOUT = (SequenceLayout)$LAYOUT.select(groupElement("__names"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * const char *__names[13]
     * }
     */
    public static final SequenceLayout __names$layout() {
        return __names$LAYOUT;
    }

    private static final long __names$OFFSET = 128;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * const char *__names[13]
     * }
     */
    public static final long __names$offset() {
        return __names$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * const char *__names[13]
     * }
     */
    public static MemorySegment __names(MemorySegment struct) {
        return struct.asSlice(__names$OFFSET, __names$LAYOUT.byteSize());
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * const char *__names[13]
     * }
     */
    public static void __names(MemorySegment struct, MemorySegment fieldValue) {
        MemorySegment.copy(fieldValue, 0L, struct, __names$OFFSET, __names$LAYOUT.byteSize());
    }

    private static long[] __names$DIMS = { 13 };

    /**
     * Dimensions for array field:
     * {@snippet lang=c :
     * const char *__names[13]
     * }
     */
    public static long[] __names$dimensions() {
        return __names$DIMS;
    }
    private static final VarHandle __names$ELEM_HANDLE = __names$LAYOUT.varHandle(sequenceElement());

    /**
     * Indexed getter for field:
     * {@snippet lang=c :
     * const char *__names[13]
     * }
     */
    public static MemorySegment __names(MemorySegment struct, long index0) {
        return (MemorySegment)__names$ELEM_HANDLE.get(struct, 0L, index0);
    }

    /**
     * Indexed setter for field:
     * {@snippet lang=c :
     * const char *__names[13]
     * }
     */
    public static void __names(MemorySegment struct, long index0, MemorySegment fieldValue) {
        __names$ELEM_HANDLE.set(struct, 0L, index0, fieldValue);
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

