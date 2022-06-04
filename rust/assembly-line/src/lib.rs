// This stub file contains items that aren't used yet; feel free to remove this module attribute
// to enable stricter warnings.
#![allow(unused)]

const CAR_PRODUCTION_BASE_RATE: f64 = 221.0;

pub fn production_rate_per_hour(speed: u8) -> f64 {
    let success_rate = match speed {
        0..=4 => 1.0,
        5..=8 => 0.9,
        9..=10 => 0.77,
        _ => panic!("Illegal speed setting: {}", speed),
    };
    CAR_PRODUCTION_BASE_RATE * <f64>::from(speed) * success_rate
}

pub fn working_items_per_minute(speed: u8) -> u32 {
    (production_rate_per_hour(speed) / 60.).floor() as u32
}
