package org.sam.orm;

import java.util.Comparator;
import java.util.Iterator;
import java.util.Optional;
import java.util.Spliterator;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.IntFunction;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.function.ToDoubleFunction;
import java.util.function.ToIntFunction;
import java.util.function.ToLongFunction;
import java.util.stream.Collector;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.LongStream;
import java.util.stream.Stream;

public class Manager<E> implements Stream<E> {

	public Iterator<E> iterator() {
		// TODO Auto-generated method stub
		return null;
	}

	public Spliterator<E> spliterator() {
		// TODO Auto-generated method stub
		return null;
	}

	public boolean isParallel() {
		// TODO Auto-generated method stub
		return false;
	}

	public Stream<E> sequential() {
		// TODO Auto-generated method stub
		return null;
	}

	public Stream<E> parallel() {
		// TODO Auto-generated method stub
		return null;
	}

	public Stream<E> unordered() {
		// TODO Auto-generated method stub
		return null;
	}

	public Stream<E> onClose(Runnable closeHandler) {
		// TODO Auto-generated method stub
		return null;
	}

	public void close() {
		// TODO Auto-generated method stub
		
	}

	public Stream<E> filter(Predicate<? super E> predicate) {
		// TODO Auto-generated method stub
		return null;
	}

	public <R> Stream<R> map(Function<? super E, ? extends R> mapper) {
		// TODO Auto-generated method stub
		return null;
	}

	public IntStream mapToInt(ToIntFunction<? super E> mapper) {
		// TODO Auto-generated method stub
		return null;
	}

	public LongStream mapToLong(ToLongFunction<? super E> mapper) {
		// TODO Auto-generated method stub
		return null;
	}

	public DoubleStream mapToDouble(ToDoubleFunction<? super E> mapper) {
		// TODO Auto-generated method stub
		return null;
	}

	public <R> Stream<R> flatMap(Function<? super E, ? extends Stream<? extends R>> mapper) {
		// TODO Auto-generated method stub
		return null;
	}

	public IntStream flatMapToInt(Function<? super E, ? extends IntStream> mapper) {
		// TODO Auto-generated method stub
		return null;
	}

	public LongStream flatMapToLong(Function<? super E, ? extends LongStream> mapper) {
		// TODO Auto-generated method stub
		return null;
	}

	public DoubleStream flatMapToDouble(Function<? super E, ? extends DoubleStream> mapper) {
		// TODO Auto-generated method stub
		return null;
	}

	public Stream<E> distinct() {
		// TODO Auto-generated method stub
		return null;
	}

	public Stream<E> sorted() {
		// TODO Auto-generated method stub
		return null;
	}

	public Stream<E> sorted(Comparator<? super E> comparator) {
		// TODO Auto-generated method stub
		return null;
	}

	public Stream<E> peek(Consumer<? super E> action) {
		// TODO Auto-generated method stub
		return null;
	}

	public Stream<E> limit(long maxSize) {
		// TODO Auto-generated method stub
		return null;
	}

	public Stream<E> skip(long n) {
		// TODO Auto-generated method stub
		return null;
	}

	public void forEach(Consumer<? super E> action) {
		// TODO Auto-generated method stub
		
	}

	public void forEachOrdered(Consumer<? super E> action) {
		// TODO Auto-generated method stub
		
	}

	public Object[] toArray() {
		// TODO Auto-generated method stub
		return null;
	}

	public <A> A[] toArray(IntFunction<A[]> generator) {
		// TODO Auto-generated method stub
		return null;
	}

	public E reduce(E identity, BinaryOperator<E> accumulator) {
		// TODO Auto-generated method stub
		return null;
	}

	public Optional<E> reduce(BinaryOperator<E> accumulator) {
		// TODO Auto-generated method stub
		return null;
	}

	public <U> U reduce(U identity, BiFunction<U, ? super E, U> accumulator, BinaryOperator<U> combiner) {
		// TODO Auto-generated method stub
		return null;
	}

	public <R> R collect(Supplier<R> supplier, BiConsumer<R, ? super E> accumulator, BiConsumer<R, R> combiner) {
		// TODO Auto-generated method stub
		return null;
	}

	public <R, A> R collect(Collector<? super E, A, R> collector) {
		// TODO Auto-generated method stub
		return null;
	}

	public Optional<E> min(Comparator<? super E> comparator) {
		// TODO Auto-generated method stub
		return null;
	}

	public Optional<E> max(Comparator<? super E> comparator) {
		// TODO Auto-generated method stub
		return null;
	}

	public long count() {
		// TODO Auto-generated method stub
		return 0;
	}

	public boolean anyMatch(Predicate<? super E> predicate) {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean allMatch(Predicate<? super E> predicate) {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean noneMatch(Predicate<? super E> predicate) {
		// TODO Auto-generated method stub
		return false;
	}

	public Optional<E> findFirst() {
		// TODO Auto-generated method stub
		return null;
	}

	public Optional<E> findAny() {
		// TODO Auto-generated method stub
		return null;
	}

	

}
