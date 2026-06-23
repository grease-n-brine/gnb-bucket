# Z-Score Normalization

## Definition:

Z-score normalization (or standardization) is a statistical technique that transforms data so that it has a mean of 0 and a standard deviation of 1.  It is used to transform data into a standard normal distribution, ensuring that all features are on the same scale.

## Formula:

z = (x - μ) / σ

Where:

- x = Original value
- μ = Mean
- σ = Standard deviation
- z = Normalized value

## Application:

### Original Data:

    [10, 20, 30]

### Mean:

    μ = (10 + 20 + 30) / 3 = 20

### Standard Deviation:

    σ = √(((10-20)² + (20-20)² + (30-20)²) / 3)

    = √((100 + 0 + 100) / 3)

    = √(66.67)

    ≈ 8.16

### Z-Score Normalized:

    [(10-20)/8.16, (20-20)/8.16, (30-20)/8.16]

    ≈ [-1.22, 0, 1.22]